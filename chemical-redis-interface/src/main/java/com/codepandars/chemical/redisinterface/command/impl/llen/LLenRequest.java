package com.codepandars.chemical.redisinterface.command.impl.llen;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class LLenRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "llen" ;
	}

	private LLenRequest(String key){
		this.key  = key ;
	}
	
	public static LLenRequest build(String key){
		return new LLenRequest(key) ;
	}
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
