package com.codepandars.chemical.common.third.cl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codepandars.chemical.common.constant.RetCode;
import com.codepandars.chemical.common.exception.JnwtvException;
import com.codepandars.chemical.common.util.HttpHelper;

/**
 * 创蓝短信存量查询器
 * @author cz
 *
 */
public class CLSmsBalanceQuerier {
	
	private static final String KEY_ACCOUNT = "account" ;
	
	private static final String KEY_PSWD = "pswd" ;
	
	private static final Logger logger = LoggerFactory.getLogger(CLSmsBalanceQuerier.class) ;
	
	public SmsBalance query( String account , String pswd ) throws IOException{
		
		Map<String,String> params = new HashMap<String,String>() ;
		params.put(KEY_ACCOUNT, account) ;
		params.put(KEY_PSWD, pswd) ;
		String response = HttpHelper.doGet("http://sapi.253.com/msg/QueryBalance", params) ;
		 
		BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(response.getBytes()))) ;
		CLSmsBalanceQueryResponse balance = null ;
		Integer i = 0 ;
		String line = null ;

		while( (line = reader.readLine()) != null){
			i ++ ;
			if( i == 1){
				balance = buildCLSmsBalance(line);
				continue ;
			}else if(i == 2){
				fillCLSmsBalance(balance,line) ;
			}else{
				logger.error( "短信余额查询出2条以上记录" );
			}
			
			
		}
		
		return balance ;
	}
	
	private CLSmsBalanceQueryResponse buildCLSmsBalance(String firstLine) throws JnwtvException{
		CLSmsBalanceQueryResponse balance = new CLSmsBalanceQueryResponse() ;
		String[] columns = firstLine.split("," , -1) ;
		
		String responseCode = columns[1] ;
		if( !StringUtils.equals(responseCode, "0") ){
			if( StringUtils.equals(responseCode,"101") ){
				throw new JnwtvException(RetCode.THIRD_CL_SMS_ACCOUNT_NOTEXISTS) ;
			}else if( StringUtils.equals(responseCode,"102") ){
				throw new JnwtvException(RetCode.THIRD_CL_SMS_WRONG_PASSWORD) ;
			}else if( StringUtils.equals(responseCode,"103") ){
				throw new JnwtvException(RetCode.THIRD_CL_SMS_QUERY_TO_FAST) ;
			}
		}
		
		balance.setQueryDateTime(columns[0]);
		
		return balance ;
		
	}
	
	private void fillCLSmsBalance(CLSmsBalanceQueryResponse balance , String line) throws JnwtvException{
		String[] columns = line.split("," , -1) ;
		balance.setProductId(columns[0]);
		balance.setBalance(Integer.parseInt(columns[1]) );
	}
	
}
