package com.codepandars.chemical.redisinterface.command.impl.incr;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;

public class IncrCommand extends BaseCommand<IncrRequest,IncrResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public IncrCommand(IncrRequest request){
		super(request);
	}

	@Override
	protected IncrResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (IncrResponse)JSONObject.toBean(jsonObj,IncrResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		return params;
		
	}
}
