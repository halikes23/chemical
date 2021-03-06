package com.codepandars.chemical.redisinterface.command.impl.hgetall;

import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;

import net.sf.json.JSONObject;

public class HGetAllCommand extends BaseCommand<HGetAllRequest,HGetAllResponse> implements ICommand{

	public HGetAllCommand(HGetAllRequest request){
		super(request);
	}
	

	@Override
	protected HGetAllResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (HGetAllResponse)JSONObject.toBean(jsonObj,HGetAllResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		return params;
		
	}
}
