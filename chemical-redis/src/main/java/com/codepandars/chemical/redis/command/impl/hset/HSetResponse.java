package com.codepandars.chemical.redis.command.impl.hset;

import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseResponse;

public class HSetResponse extends BaseResponse<Long>{

	HSetResponse(Map<String, Object> request,Object result) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT, result) ;
	}

	private static final long serialVersionUID = -9116920482562534962L;

}
