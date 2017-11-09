package com.codepandars.chemical.redisinterface.command.impl.hincrby;

import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;

import net.sf.json.JSONObject;

public class HIncrByCommand extends BaseCommand<HIncrByRequest,HIncrByResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public HIncrByCommand(HIncrByRequest request){
		super(request);
	}
	

	@Override
	protected HIncrByResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (HIncrByResponse)JSONObject.toBean(jsonObj,HIncrByResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		params.put("field", request.getField()) ;
		params.put("value", String.valueOf(request.getValue())) ;
		
		return params;
		
	}
}
