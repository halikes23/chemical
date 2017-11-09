package com.fq.redis.command.impl.sadd;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class SAddResponse extends BaseResponse<Long>{

	private static final long serialVersionUID = 8693866800891847944L;

	SAddResponse(Map<String, Object> request,Object count) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_COUNT,count) ;
	}

}
