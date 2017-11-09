package com.codepandars.chemical.redis.command.impl.hget;

import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseResponse;

public class HGetResponse extends BaseResponse<String>{

	HGetResponse(Map<String, Object> request , Object data) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_VALUE, data) ;
	}
	
	private static final long serialVersionUID = -9116920482562534962L;
	
}
