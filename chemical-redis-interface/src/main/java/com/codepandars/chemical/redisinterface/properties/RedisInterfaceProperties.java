package com.codepandars.chemical.redisinterface.properties;

import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import com.codepandars.chemical.redisinterface.constant.RedisInterfaceConstant;
import com.codepandars.chemical.redisinterface.redisserver.RedisServer;
import com.fq.util.ConfigUtil;

public class RedisInterfaceProperties {

//	redis.redis_access_key=jwxfQuqBTiy39mEfpU1ahrq4jh043M2hUrrG1Zlf
//	redis.redis_secret_key=Z-yv96BbR8jzRtViZ0Gmk954chJmk4ifa_lUrrrd
	
	/**
	 * 访问账户码
	 */
	public static final String REDIS_ACCESS_KEY ;
	/**
	 * 访问安全码
	 */
	public static final String REDIS_SECRET_KEY ;
	
	/**
	 * REDIS服务器访问地址 IP:PORT
	 */
	public static final RedisServer REDIS_SERVER_ADDR ;
	
	/**
	 * 每个REDIS服务最大异常访问次数
	 */
	public static final int REDIS_MAX_ERR_ACCESS_COUNT_PER ;
	
	
	static{
	
		Properties prop = ConfigUtil.readProperty( RedisInterfaceConstant.CFG_BASE_PATH +"redis.properties" ) ;

		REDIS_ACCESS_KEY = prop.getProperty("redis.redis_access_key").toString();
		
		REDIS_SECRET_KEY = prop.getProperty("redis.redis_secret_key").toString();
		
		String addr = prop.getProperty("redis.redis_server_addr").toString() ;
		REDIS_SERVER_ADDR = new RedisServer(addr) ;
	
		REDIS_MAX_ERR_ACCESS_COUNT_PER = prop.getProperty("redis.redis_max_err_access_count_per") == null ? 100 : Integer.parseInt(prop.getProperty("redis.redis_max_err_access_count_per").toString()) ;
		
	}
	
}
