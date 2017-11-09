package com.codepandars.chemical.redisinterface.command.impl.sismember;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class SIsMemberRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "sismember" ;
	}

	private SIsMemberRequest(String key , String member){
		this.key = key ;
		this.member = member ;
	}
	
	public static SIsMemberRequest build(String key , String member){
		return new SIsMemberRequest(key,member) ;
	}
	
	private String key ;

	private String member ;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

}
