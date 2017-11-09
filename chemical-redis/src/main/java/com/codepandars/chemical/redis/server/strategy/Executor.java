package com.codepandars.chemical.redis.server.strategy;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.ExecutorExceptionHandler;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.server.RedisServer;
import com.codepandars.chemical.redis.server.RedisServerContext;
import com.fq.common.constant.CommonConstant;
import com.fq.common.constant.RetCode;

import redis.clients.jedis.Jedis;

@Service
public class Executor {

	private final static Logger logger = LoggerFactory.getLogger(Executor.class) ;
	 
	@Autowired
	private RedisServerContext redisServerContext ;
	
	@Autowired
	private ExecutorExceptionHandler executorExceptionHandler ;
	
	public BaseResponse<?> execute( ICommand command , Map<String,Object> request ){
		
		boolean broken = false ;
		
		BaseResponse<?> response = null ;
		// 根据命令按策略获取Redis服务
		RedisServer redisServer = null;
		
		Jedis jedis = null ;
		
		try{
			
			redisServer = redisServerContext.getRedisServer(command);;
			
			jedis = redisServer.getConnection() ;
			
			response = command.execute( jedis , request );
			
			response.put(CommonConstant.REDIS_KEY_RET_CODE,RetCode.buildRetCodeResult(RetCode.SUCCESS)) ;
		
			logger.debug(String.format("redis【%s】 is called" , redisServer.getAddr() ) );
			
			return response ;
			
		}catch(Exception e){
			broken = true ;
			logger.error("",e);
			return executorExceptionHandler.handle(redisServer == null ? "NULL" : redisServer.getAddr() , e, request) ;
		}finally{
			if(jedis != null){
				redisServer.closeConnection(jedis,broken);
			}
		}
		
	}
		
	
}
