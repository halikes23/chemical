package com.fq.command.impl.hincrby;

import java.util.HashMap;
import java.util.Map;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.CommonConstant;

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
