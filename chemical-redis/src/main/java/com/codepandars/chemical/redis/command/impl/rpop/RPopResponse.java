package com.codepandars.chemical.redis.command.impl.rpop;

import java.util.Map;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

public class RPopResponse extends BaseResponse<String>{

	private static final long serialVersionUID = -3235562948128911561L;

	RPopResponse(Map<String, Object> request,Object value) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_VALUE, value) ;
	}

	

}
