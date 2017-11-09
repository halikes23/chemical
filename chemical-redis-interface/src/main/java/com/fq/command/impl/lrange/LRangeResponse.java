package com.fq.command.impl.lrange;

import java.util.List;

import com.fq.command.BaseResponse;

public class LRangeResponse extends BaseResponse{

	private List<String> list ;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "LRangeResponse [list=" + list + "]";
	}

}
