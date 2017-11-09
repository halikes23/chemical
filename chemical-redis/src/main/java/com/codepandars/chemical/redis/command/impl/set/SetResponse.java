package com.codepandars.chemical.redis.command.impl.set;

import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseResponse;

public class SetResponse extends BaseResponse<String>{

	private static final long serialVersionUID = -9116920482562534962L;
	
	SetResponse(Map<String, Object> request,Object result) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT, result) ;
	}


	
}
