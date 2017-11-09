package com.fq.redis.command.impl.get;

import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseResponse;

public class GetResponse extends BaseResponse<String>{

	GetResponse(Map<String, Object> request,Object data) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_VALUE, data) ;
	}
	
	private static final long serialVersionUID = -9116920482562534962L;


}
