package com.codepandars.chemical.redis.command.impl.lpush;

import java.util.Map;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

public class LPushResponse extends BaseResponse<Long>{

	private static final long serialVersionUID = -3235562948128911561L;

	LPushResponse(Map<String, Object> request,Object count) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_COUNT, count) ;
	}
	
}
