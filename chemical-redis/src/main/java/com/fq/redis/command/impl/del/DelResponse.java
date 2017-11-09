package com.fq.redis.command.impl.del;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class DelResponse extends BaseResponse<Long>{

	DelResponse(Map<String, Object> request,Object result) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESULT, result) ;
	}
	
	private static final long serialVersionUID = -9116920482562534962L;

}
