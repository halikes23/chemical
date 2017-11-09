package com.fq.command.impl.hgetall;

import java.util.Map;

import com.fq.command.BaseResponse;

public class HGetAllResponse extends BaseResponse{

	private Map<String,String> result ;

	public Map<String, String> getResult() {
		return result;
	}

	public void setResult(Map<String, String> result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "HGetAllResponse [value=" + result + "]";
	}
	
}
