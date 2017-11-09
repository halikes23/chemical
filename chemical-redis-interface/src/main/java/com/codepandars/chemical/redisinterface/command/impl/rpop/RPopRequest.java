package com.codepandars.chemical.redisinterface.command.impl.rpop;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class RPopRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "rpop" ;
	}
	
	private RPopRequest(String key){
		this.key = key ;
	}

	public static RPopRequest build(String key){
		return new RPopRequest(key) ;
	}
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
