package com.fq.redis.command.impl.batch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class BatchResponse extends BaseResponse<Object>{
	
	private static final long serialVersionUID = -9116920482562534962L;
	
	public BatchResponse(Map<String, Object> request,Object object) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_RESPONSES, object) ;
	}

}
