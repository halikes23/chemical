package com.fq.command.impl.hgetall;

import com.fq.command.BaseRequest;

public class HGetAllRequest extends BaseRequest{

	public static HGetAllRequest build(String key){
		HGetAllRequest request = new HGetAllRequest() ;
		request.setKey(key);
		return request;
	}
	
	public void initCommandType(){
		this.commandType = "hgetall" ;
	}
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
