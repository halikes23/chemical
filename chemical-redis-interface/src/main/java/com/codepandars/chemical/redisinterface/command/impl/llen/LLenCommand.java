package com.codepandars.chemical.redisinterface.command.impl.llen;

import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class LLenCommand  extends BaseCommand<LLenRequest,LLenResponse> implements ICommand{

	public LLenCommand(LLenRequest request){
		super(request);
	}

	@Override
	protected LLenResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (LLenResponse)JSONObject.toBean(jsonObj,LLenResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		return params;
		
	}

}
