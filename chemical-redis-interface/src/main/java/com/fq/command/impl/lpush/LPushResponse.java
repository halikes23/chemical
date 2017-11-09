package com.fq.command.impl.lpush;

import com.fq.command.BaseResponse;

public class LPushResponse extends BaseResponse{

	private String newValue ;

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Override
	public String toString() {
		return "LPushResponse [newValue=" + newValue + "]";
	}
	
}
