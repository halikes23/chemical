package com.codepandars.chemical.common.constant;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 返回结果
 * @author zhen.cheng
 *
 */
public class RetCode {
	
	private static final Logger logger = LoggerFactory.getLogger(RetCode.class) ;
	
	public final static String KEY_RET_CODE = "code" ;
	public final static String KEY_CODE_MSG = "codeMsg";
	
	private final static Map<String,String> unmodifiableMsgs ;
	
	@RetCodeElement(value="成功") 
	public final static String SUCCESS = "0" ; 

	@RetCodeElement(value="系统错误") 
	public final static String SYSTEM_ERROR = "EC00000" ; 
	
	@RetCodeElement(value="错误的时间格式") 
	public final static String WRONG_DATE_FORMAT = "EC00001" ; 
	
	@RetCodeElement(value="创蓝短信账号不存在") 
	public final static String THIRD_CL_SMS_ACCOUNT_NOTEXISTS = "ET00001" ; 
	
	@RetCodeElement(value="创蓝短信账号密码错误") 
	public final static String THIRD_CL_SMS_WRONG_PASSWORD = "ET00002" ; 
	
	@RetCodeElement(value="创蓝短信存量查询过于频繁") 
	public final static String THIRD_CL_SMS_QUERY_TO_FAST = "ET00003" ; 
	
	@RetCodeElement(value="REDIS不支持的命令") 
	public final static String REDIS_UNSUPPORT_COMMAND = "ER00001" ;
	
	@RetCodeElement(value="REDIS服务访问权限缺失") 
	public final static String REDIS_LIMIT_ACCESS_PREMISSION = "ER00002" ;
	
	@RetCodeElement(value="REDIS服务为只读服务") 
	public final static String REDIS_IS_READONLY = "ER00003" ;

	@RetCodeElement(value="REDIS服务全部访问失败") 
	public final static String REDIS_ACCESS_ALL_SERVER_ERR = "ER00004" ;
	
	
	static {
		
		System.out.println("loading ... ");
		Map<String,String> msgs = new HashMap<String,String>() ;
		Field[] fields = RetCode.class.getDeclaredFields() ;
		for(Field field : fields){
			
			RetCodeElement element = field.getAnnotation(RetCodeElement.class) ;
			if(element != null){
				System.out.println(field.getName() + " : " + element.value());
				try {
					msgs.put((String)field.get(RetCode.class), element.value()) ;
				}catch (Exception e) {
					logger.error("RetCode 加载失败",e);
				}
			}
			
		}
		unmodifiableMsgs = java.util.Collections.unmodifiableMap( msgs ) ;
		
	}
	
	public static void main(String[] args) {
		Map<String,Object> success = RetCode.buildRetCodeResult(RetCode.SUCCESS) ;
		System.out.println(success);
	}

	
	
	/**
	 * 根据code 返回对应描述
	 * @param code
	 * @return
	 */
	public final static String RET_CODE_MSG( String code ){
		
		return unmodifiableMsgs.get( code ) ;
		
	}
	
	/**
	 * 生成结果返回MAP
	 * @param code
	 * @return
	 */
	public static Map<String,Object> buildRetCodeResult( String code ){
		Map<String,Object> rst = new HashMap<String,Object>() ;
		rst.put( KEY_RET_CODE , code ) ;
		rst.put( KEY_CODE_MSG , RET_CODE_MSG( code )) ;
		return rst ;
	}
	
}
