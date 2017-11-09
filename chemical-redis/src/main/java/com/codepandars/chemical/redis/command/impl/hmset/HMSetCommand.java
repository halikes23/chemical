package com.codepandars.chemical.redis.command.impl.hmset;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.common.constant.BaseConstant;
import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("hMSetCommand")
public class HMSetCommand  extends BaseCommand implements ICommand<String>{

	@Override
	public BaseResponse<String> execute(Jedis jedis ,Map<String,Object> req) {
		
		
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String[] arrFV = ((String)req.get(CommonConstant.REDIS.KEY_FIELDS_AND_VALUES)).split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL,-1);
		Map<String,String> fieldsAndValues = new HashMap<String,String>() ;
		String field = null ;
		for( int i = 0 ; i < arrFV.length ; i ++ ){
			
			if(i%2 == 0){
				field = arrFV[i] ;
			}else{
				fieldsAndValues.put(field,arrFV[i]) ;
			}
			
		}
		
		String result = jedis.hmset(key, fieldsAndValues) ;
		
		HMSetResponse rep = (HMSetResponse)ResponseFactoryContext.get(HMSetCommand.class).build(req, result) ;
		
		return rep;
	}
	
	@Override
	public void execute(Transaction t ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String[] arrFV = ((String)req.get(CommonConstant.REDIS.KEY_FIELDS_AND_VALUES)).split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL,-1);
		Map<String,String> fieldsAndValues = new HashMap<String,String>() ;
		String field = null ;
		for( int i = 0 ; i < arrFV.length ; i ++ ){
			
			if(i%2 == 0){
				field = arrFV[i] ;
			}else{
				fieldsAndValues.put(field,arrFV[i]) ;
			}
			
		}
		
		t.hmset(key, fieldsAndValues) ;
		
	}
	
	public boolean isWrite() {
		return true;
	}
	
}
