package com.fq.command.impl.hincrby;

import java.util.Map;

import com.fq.command.BaseResponse;

public class HIncrByResponse extends BaseResponse{

	private Long result ;

	public Long getResult() {
		return result;
	}

	public void setResult(Long result) {
		this.result = result;
	}
	
}
