package com.fq.redis.command.impl.sismember;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class SIsMemberResponse extends BaseResponse<Boolean>{

	private static final long serialVersionUID = -5531955343259870056L;

	
	SIsMemberResponse(Map<String, Object> request,Object result) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT,result) ;
	}
	
}
