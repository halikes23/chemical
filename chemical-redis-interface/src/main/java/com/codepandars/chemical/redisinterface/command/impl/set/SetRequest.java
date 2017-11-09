package com.codepandars.chemical.redisinterface.command.impl.set;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class SetRequest extends BaseRequest{

	public static SetRequest build(String key , String value){
		return new SetRequest(key,value) ;
	}
	
	public static SetRequest build(String key , String value , Integer ex ){
		return new SetRequest(key,value,ex) ;
	}
	
	private SetRequest(String key , String value){
		this.key = key ;
		this.value = value ;
	}
	
	private SetRequest(String key , String value , Integer ex ){
		this.key = key ;
		this.value = value ;
		this.ex = ex ;
	}
	
	public void initCommandType(){
		commandType = "set";
	}
	
	private String key ;
	
	private String value;
	
	private Integer ex ;
	
	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

	public Integer getEx() {
		return ex;
	}

}
