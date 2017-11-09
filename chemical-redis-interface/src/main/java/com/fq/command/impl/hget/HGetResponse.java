package com.fq.command.impl.hget;

import com.fq.command.BaseResponse;

public class HGetResponse extends BaseResponse{

	private String value ;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "HGetResponse [value=" + value + "]";
	}

}
