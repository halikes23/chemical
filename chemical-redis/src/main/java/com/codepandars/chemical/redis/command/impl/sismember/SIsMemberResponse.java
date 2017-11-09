package com.codepandars.chemical.redis.command.impl.sismember;

import java.util.Map;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

public class SIsMemberResponse extends BaseResponse<Boolean>{

	private static final long serialVersionUID = -5531955343259870056L;

	
	SIsMemberResponse(Map<String, Object> request,Object result) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT,result) ;
	}
	
}
