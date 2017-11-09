package com.codepandars.chemical.redisinterface.command.impl.sadd;

import com.codepandars.chemical.redisinterface.command.BaseResponse;

public class SAddResponse extends BaseResponse{

	private Integer count ;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "SaddResponse [count=" + count + "]";
	}
	
	
	
}
