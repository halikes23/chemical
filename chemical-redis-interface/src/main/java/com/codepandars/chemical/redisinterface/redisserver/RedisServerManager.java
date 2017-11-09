package com.codepandars.chemical.redisinterface.redisserver;

import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redisinterface.properties.RedisInterfaceProperties;

/**
 * REDIS服务管理器
 * @author zhen.cheng
 *
 */
@Service
public class RedisServerManager {
	
	
	public RedisServerManager(){
		RedisInterfaceProperties redisInterfaceProperties = new RedisInterfaceProperties() ;
	}
	
	public static RedisServer getServer(){
		return RedisInterfaceProperties.REDIS_SERVER_ADDR ;
	}

}
