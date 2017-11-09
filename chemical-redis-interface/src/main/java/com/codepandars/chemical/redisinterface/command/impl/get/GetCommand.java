package com.codepandars.chemical.redisinterface.command.impl.get;

import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;

import net.sf.json.JSONObject;

public class GetCommand extends BaseCommand<GetRequest,GetResponse> implements ICommand{

	public GetCommand(GetRequest request){
		super(request);
	}
	

	@Override
	protected GetResponse buildResponse(String response) {
		
		logger.debug(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (GetResponse)JSONObject.toBean(jsonObj,GetResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		return params;
		
	}
}
