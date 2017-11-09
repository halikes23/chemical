package com.fq.redis.command.impl.incr;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class IncrResponse extends BaseResponse<Long>{

	private static final long serialVersionUID = 8926105262586175216L;

	IncrResponse(Map<String,Object> request,Object data) {
		super(request);
		this.put( CommonConstant.REDIS.KEY_NEW_VALUE,data) ;
	}

	
}
