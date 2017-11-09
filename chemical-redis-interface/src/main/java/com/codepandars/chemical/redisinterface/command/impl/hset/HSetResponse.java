package com.codepandars.chemical.redisinterface.command.impl.hset;

import com.codepandars.chemical.redisinterface.command.BaseResponse;

public class HSetResponse extends BaseResponse{

	private String result ;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "HSetResponse [result=" + result + "]";
	}

}
