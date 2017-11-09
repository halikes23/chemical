package com.fq.command.impl.get;

import com.fq.command.BaseRequest;

public class GetRequest extends BaseRequest{

	public static GetRequest build(String key){
		GetRequest request = new GetRequest() ;
		request.setKey(key);
		return request ;
	}
	
	public void initCommandType(){
		this.commandType = "get" ;
	}
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
