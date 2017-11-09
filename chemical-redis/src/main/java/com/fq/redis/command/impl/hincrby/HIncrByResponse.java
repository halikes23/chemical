package com.fq.redis.command.impl.hincrby;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class HIncrByResponse extends BaseResponse<Long>{

	private static final long serialVersionUID = -9116920482562534962L;
	
	HIncrByResponse(Map<String, Object> request,Object result) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT, result) ;
	} 

}
