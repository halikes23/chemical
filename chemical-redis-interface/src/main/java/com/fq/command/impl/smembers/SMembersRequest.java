package com.fq.command.impl.smembers;

import com.fq.command.BaseRequest;

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
