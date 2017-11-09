package com.codepandars.chemical.redisinterface.command.impl.set;

import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class SetCommand extends BaseCommand<SetRequest,SetResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public SetCommand(SetRequest request){
		super(request);
	}
	

	@Override
	protected SetResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (SetResponse)JSONObject.toBean(jsonObj,SetResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		params.put("value", request.getValue()) ;
		if(request.getEx() != null){
			params.put("ex", String.valueOf(request.getEx())) ;
		}
		
		return params;
		
	}
}
