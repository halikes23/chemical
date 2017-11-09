package com.codepandars.chemical.redis.command;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ResponseFactoryContext {

	private final static Logger logger = LoggerFactory.getLogger(ResponseFactoryContext.class) ;
	
	private final static Map<Class<?> , ResponseFactory> factories = new HashMap<Class<?>, ResponseFactory>();
	
	public static void register(Class<? extends ICommand<?>> command , ResponseFactory factory){
		logger.info("{}注册至ResponseFactoryContext", factory.getClass());
		factories.put(command, factory) ;
	}
	
	public static <T extends ResponseFactory> T get(Class<?> clazz){
		return (T)factories.get(clazz) ;
	}
	
}
