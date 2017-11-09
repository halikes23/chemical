package com.codepandars.chemical.redisinterface.command.impl.hget;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class HGetRequest extends BaseRequest{

	public static HGetRequest build(String key ,String field){
		return new HGetRequest(key, field) ;
	}
	
	private HGetRequest(String key , String field){
		this.key = key ;
		this.field = field ;
	}
	
	public void initCommandType(){
		this.commandType = "hget" ;
	}
	
	private String key ;
	
	private String field ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
}
