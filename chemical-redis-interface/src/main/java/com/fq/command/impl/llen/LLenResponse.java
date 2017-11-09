package com.fq.command.impl.llen;

import com.fq.command.BaseResponse;

public class LLenResponse extends BaseResponse{

	private String length ;

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "LLenResponse [length=" + length + "]";
	}

}
