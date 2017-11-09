package com.codepandars.chemical.redisinterface.command.impl.rpop;

import com.codepandars.chemical.redisinterface.command.BaseResponse;

public class RPopResponse extends BaseResponse{

	private String value ;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RPopResponse [value=" + value + "]";
	}
	
}
