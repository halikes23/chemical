package com.fq.command.impl.incr;

import com.fq.command.BaseRequest;

public class IncrRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "incr" ;
	}
	
	private String key ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
	
}
