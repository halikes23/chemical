package com.fq.redis.command.impl.hgetall;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class HGetAllResponse extends BaseResponse<Map<String,String>>{

	HGetAllResponse(Map<String, Object> request,Object object) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT, object) ;
	}

	private static final long serialVersionUID = -9116920482562534962L;

}
