package com.fq.command.impl.lpush;

import com.fq.command.BaseRequest;

public class LPushRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "lpush" ;
	}
	
	private String key ;

	private String[] values;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String[] getValues() {
		return values;
	}

	public void setValues(String ... values) {
		this.values = values;
	}
	
	
	
}
