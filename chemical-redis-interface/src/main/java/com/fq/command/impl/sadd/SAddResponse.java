package com.fq.command.impl.sadd;

import com.fq.command.BaseResponse;

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
