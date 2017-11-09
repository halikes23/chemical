package com.fq.command.impl.del;

import com.fq.command.BaseRequest;

public class DelRequest extends BaseRequest{

	public static DelRequest build(String key){
		DelRequest req = new DelRequest();
		req.setKey(key);
		return req ;
	}
	
	public void initCommandType(){
		this.commandType = "del" ;
	}
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
