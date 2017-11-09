package com.codepandars.chemical.redis.command.impl.hmget;

import java.util.List;
import java.util.Map;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

public class HMGetResponse extends BaseResponse<List<String>>{

	HMGetResponse(Map<String, Object> request,Object value) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_VALUES, value) ;
	}

	private static final long serialVersionUID = -9116920482562534962L;

}
