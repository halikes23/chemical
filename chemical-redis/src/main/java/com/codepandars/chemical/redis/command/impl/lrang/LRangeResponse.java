package com.codepandars.chemical.redis.command.impl.lrang;

import java.util.List;
import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseResponse;

public class LRangeResponse extends BaseResponse<List<String>>{

	private static final long serialVersionUID = -3235562948128911561L;

	LRangeResponse(Map<String, Object> request,Object list) {
		super(request);
		this.put(CommonConstant.REDIS.KEY_LIST, list) ;
	}

}
