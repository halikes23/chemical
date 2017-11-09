package com.codepandars.chemical.redis.command.impl.incr;

import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseResponse;

public class IncrResponse extends BaseResponse<Long>{

	private static final long serialVersionUID = 8926105262586175216L;

	IncrResponse(Map<String,Object> request,Object data) {
		super(request);
		this.put( CommonConstant.REDIS.KEY_NEW_VALUE,data) ;
	}

	
}
