package com.fq.redis;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fq.common.constant.RetCode;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.server.RedisServerContext;

@Service
public class ExecutorExceptionHandler {
	
	@Autowired
	private RedisServerContext redisServerContext ;
	
	private final static Logger logger = LoggerFactory.getLogger(ExecutorExceptionHandler.class) ;
	
	private final static String READONLY_EXCEPTION_MSG = "READONLY You can't write against a read only slave." ;
	
	public BaseResponse handle(final String addr ,Throwable e , Map<String,Object> request){
		new Thread(new Runnable() {
			@Override
			public void run() {
				redisServerContext.executeFailedCallbackHandler(addr);
			}
		}).start();
		if(StringUtils.equals(READONLY_EXCEPTION_MSG, e.getMessage())){
			logger.error("该数据库为从数据库",e);
			return BaseResponse.buildErrResponse(request,RetCode.REDIS_IS_READONLY ) ;
		}else{
			logger.error("",e);
			return BaseResponse.buildErrResponse(request,RetCode.SYSTEM_ERROR) ;
		}
	}
	
}
