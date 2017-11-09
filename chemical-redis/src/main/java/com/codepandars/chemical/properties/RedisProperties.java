package com.codepandars.chemical.properties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.codepandars.chemical.constant.RedisConstant;
import com.codepandars.chemical.redis.server.RedisServer;
import com.codepandars.chemical.util.ConfigUtil;
import com.google.common.collect.Sets;

public class RedisProperties {

//	redis.redis_access_key=jwxfQuqBTiy39mEfpU1ahrq4jh043M2hUrrG1Zlf
//	redis.redis_secret_key=Z-yv96BbR8jzRtViZ0Gmk954chJmk4ifa_lUrrrd
	
	/**
	 * 访问账户码
	 */
	public final static String REDIS_ACCESS_KEY ;
	/**
	 * 访问安全码
	 */
	public final static String REDIS_SECRET_KEY ;
	/**
	 * 访问IP白名单
	 */
	public final static Set<String> REDIS_ACCESS_IP_WHITE_LIST ;
	/**
	 * REDIS类型 1:主数据库 2：从数据库
	 */
//	public static String REDIS_ROLE ;
	
	public final static List<String> REDIS_SERVERS ;
//	
//	public final static RedisServer REDIS_MASTER ;
	
	static{
	
		Properties prop = ConfigUtil.readProperty( RedisConstant.CFG_BASE_PATH +"redis.properties" ) ;

		REDIS_ACCESS_KEY = prop.getProperty("redis.redis_access_key").toString();
		
		REDIS_SECRET_KEY = prop.getProperty("redis.redis_secret_key").toString();
		
		String strIps = prop.getProperty("redis.redis_access_ips").toString() ;
		String[] ips = strIps.split("[,]") ;
		Set<String> writeList = Sets.newHashSet(ips) ;
		REDIS_ACCESS_IP_WHITE_LIST = Collections.unmodifiableSet(writeList) ;
		
		//根据配置redis.redis_server_addrs生成REDIS服务器集合
		String[] addrs = prop.getProperty("redis.redis_server_addrs").toString().split("[,]",-1) ;
		REDIS_SERVERS = Collections.unmodifiableList(Arrays.asList(addrs));
//		
//		//根据配置redis.redis_master_addr生成REDIS MASTER对象
//		String master = prop.getProperty("redis.redis_master_addr").toString() ;
//		REDIS_MASTER = new RedisServer(master) ;
	
	}
	
}
