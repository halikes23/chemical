package com.codepandars.chemical.redisinterface.command.impl.incr;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class IncrRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "incr" ;
	}
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
