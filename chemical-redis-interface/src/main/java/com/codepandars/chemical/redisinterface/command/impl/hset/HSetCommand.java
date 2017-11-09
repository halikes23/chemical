package com.codepandars.chemical.redisinterface.command.impl.hset;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.CommonConstant;

public class HSetCommand extends BaseCommand<HSetRequest,HSetResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public HSetCommand(HSetRequest request){
		super(request);
	}

	@Override
	protected HSetResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (HSetResponse)JSONObject.toBean(jsonObj,HSetResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		params.put(CommonConstant.REDIS.KEY_FIELD, request.getField());
		
		params.put(CommonConstant.REDIS.KEY_VALUE, request.getValue()) ;
		
		return params;
		
	}
}
