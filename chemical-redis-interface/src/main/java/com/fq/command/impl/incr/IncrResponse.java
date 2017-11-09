package com.fq.command.impl.incr;

import com.fq.command.BaseResponse;

public class IncrResponse extends BaseResponse{

	private String newValue ;

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	@Override
	public String toString() {
		return "IncrResponse [newValue=" + newValue + "]";
	}
	
}
