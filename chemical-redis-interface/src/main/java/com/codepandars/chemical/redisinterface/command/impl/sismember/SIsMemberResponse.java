package com.codepandars.chemical.redisinterface.command.impl.sismember;

import com.codepandars.chemical.redisinterface.command.BaseResponse;

public class SIsMemberResponse extends BaseResponse{

	private Boolean result ;

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "SismemberResponse [result=" + result + "]";
	}

}
