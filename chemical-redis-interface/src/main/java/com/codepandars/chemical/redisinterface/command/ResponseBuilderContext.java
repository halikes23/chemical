package com.codepandars.chemical.redisinterface.command;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseBuilderContext {

	private final static Logger logger = LoggerFactory.getLogger(ResponseBuilderContext.class) ;
	
	private final static Map<Object,IResponseBuilder> builders = new HashMap<Object,IResponseBuilder>();
	
	public static void register(Object key,IResponseBuilder builder){
		logger.info("{}注册到ResponseBuilderContext",builder.getClass().getName());
		builders.put(key, builder) ;
	}
	
	public static IResponseBuilder get(Object key){
		return builders.get(key) ;
	}
	
}
