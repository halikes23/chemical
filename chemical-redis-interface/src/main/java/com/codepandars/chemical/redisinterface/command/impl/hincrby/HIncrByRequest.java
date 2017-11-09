package com.codepandars.chemical.redisinterface.command.impl.hincrby;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class HIncrByRequest extends BaseRequest{

	private HIncrByRequest(String key , String field , Integer value){
		this.key = key ;
		this.field = field ;
		this.value = value ;
	}
	
	public static final HIncrByRequest build(String key , String field , Integer value){
		return new HIncrByRequest(key,field,value) ;
	}
	
	public void initCommandType(){
		this.commandType = "hincrby" ;
	}
	
	private String key ;

	private String field ;
	
	private Integer value ;
	
	public String getKey() {
		return key;
	}

	public String getField() {
		return field;
	}

	public Integer getValue() {
		return value;
	}

}
