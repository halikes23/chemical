package com.codepandars.chemical.redisinterface.command.impl.smembers;

import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class SMembersCommand extends BaseCommand<SMembersRequest,SMembersResponse> implements ICommand{

	public SMembersCommand(SMembersRequest request){
		super(request);
	}
	

	@Override
	protected SMembersResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (SMembersResponse)JSONObject.toBean(jsonObj,SMembersResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		return params;
		
	}
}
