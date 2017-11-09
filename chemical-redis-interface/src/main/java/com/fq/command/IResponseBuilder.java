package com.fq.command;

public interface IResponseBuilder {
	
	void register() ;
	
	BaseResponse build(Object object);

}
