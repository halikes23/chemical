package com.fq.command.impl.batch;

import java.util.List;

import com.fq.command.BaseResponse;

public class BatchResponse extends BaseResponse{

	private List responses ;

	public List getResponses() {
		return responses;
	}

	public void setResponses(List responses) {
		this.responses = responses;
	}

}
