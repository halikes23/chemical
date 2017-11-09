package com.fq.redis.command.impl.ltrim;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class LTrimResponse extends BaseResponse<Long>{

	private static final long serialVersionUID = -3235562948128911561L;

	LTrimResponse(Map<String, Object> request,Object length) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT, length) ;
	}

}
