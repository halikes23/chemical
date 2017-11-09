package com.codepandars.chemical.redisinterface.command.impl.smembers;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class SMembersRequest extends BaseRequest {

	public void initCommandType(){
		this.commandType = "smembers" ;
	}
	
	private SMembersRequest(String key){
		this.key = key ;
	}
	
	public static SMembersRequest build(String key){
		return new SMembersRequest(key) ;
	}
	
	private String key ;
	
	public String getKey() {
		return key;
	}

	

}
