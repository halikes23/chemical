package com.fq.command.impl.hset;

import com.fq.command.BaseRequest;

public class HSetRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "hset" ;
	}
	
	private HSetRequest(String key , String field , String value){
		this.key = key ;
		this.field = field ;
		this.value = value ;
	}
	
	public static HSetRequest build(String key , String field , String value){
		return new HSetRequest(key, field, value) ;
	}
	
	private String key ;
	
	private String field ;
	
	private String value ;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
