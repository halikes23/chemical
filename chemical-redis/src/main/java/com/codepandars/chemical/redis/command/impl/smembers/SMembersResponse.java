package com.codepandars.chemical.redis.command.impl.smembers;

import java.util.Map;
import java.util.Set;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

public class SMembersResponse extends BaseResponse<Set<String>>{

	private static final long serialVersionUID = -5531955343259870056L;

	SMembersResponse(Map<String, Object> request,Object members) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_MEMBERS,members) ;
	}
	
	
}
