package com.codepandars.chemical.redisinterface.command.impl.hmset;

import com.codepandars.chemical.redisinterface.command.BaseResponse;

public class HMSetResponse extends BaseResponse{

	private String result ;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "HMSetResponse [result=" + result + "]";
	}

}
