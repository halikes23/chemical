package com.codepandars.chemical.redisinterface.command.impl.rpop;

import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class RPopCommand extends BaseCommand<RPopRequest,RPopResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public RPopCommand(RPopRequest request){
		super(request);
	}

	@Override
	protected RPopResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (RPopResponse)JSONObject.toBean(jsonObj,RPopResponse.class);
	}


	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		return params;
		
	}


}
