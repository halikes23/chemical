package com.codepandars.chemical.redis.command.impl.sadd;

import java.util.Map;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

public class SAddResponse extends BaseResponse<Long>{

	private static final long serialVersionUID = 8693866800891847944L;

	SAddResponse(Map<String, Object> request,Object count) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_COUNT,count) ;
	}

}
