package com.fq.redis.command;

import java.util.HashMap;
import java.util.Map;

import com.fq.common.constant.CommonConstant;
import com.fq.common.constant.RetCode;

public abstract class BaseResponse<T> extends HashMap<String,Object> implements Map<String,Object>{

	
	private static final long serialVersionUID = 1188742498078243673L;
	
	private Map<String,Object> request ;
	
	public BaseResponse(Map<String,Object> request){
		this.request = request ;
		this.put("stimestamp", request.get("stimestamp")) ;
		this.put("clientIp", request.get("clientIp")) ;
		this.put("commandType",request.get("commandType"));
	}
	
//	protected abstract void setData(T data);
	
	protected Map<String,Object> getRequest(){
		return request ;
	}
	
	public static BaseResponse<?> buildErrResponse(Map<String,Object> request , String code){
//		BaseResponse<?> response = new BaseResponse(request) ;
//		
//		response.put(CommonConstant.REDIS_KEY_RET_CODE,RetCode.buildRetCodeResult(code)) ;
		
//		return response ;
		return null ;
	}

}
