package com.codepandars.chemical.redisinterface.command;

public interface IResponseBuilder {
	
	void register() ;
	
	BaseResponse build(Object object);

}
