package com.fq.command.impl.sadd;

import com.fq.command.BaseRequest;

public class SAddRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "sadd" ;
	}
	
	private SAddRequest(String key , String[] members){
		this.key = key ;
		this.members = members ;
	}
	
	public static SAddRequest build(String key , String ... members){
		return new SAddRequest(key , members) ;
	}
	
	private String key ;

	private String[] members ;
	
	public String getKey() {
		return key;
	}

	public String[] getMembers() {
		return members;
	}
	
}
