package com.codepandars.chemical.redis.command;

import java.util.Map;

public interface ResponseFactory {

	public void init() ;
	
	public BaseResponse<?> build( Map<String,Object> req , Object data ) ;
	
}
