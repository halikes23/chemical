package com.fq.command.impl.rpop;

import com.fq.command.BaseResponse;

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
