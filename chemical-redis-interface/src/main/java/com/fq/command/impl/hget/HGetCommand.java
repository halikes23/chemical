package com.fq.command.impl.hget;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.CommonConstant;

public class HGetCommand extends BaseCommand<HGetRequest,HGetResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public HGetCommand(HGetRequest request){
		super(request);
	}

	@Override
	protected HGetResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (HGetResponse)JSONObject.toBean(jsonObj,HGetResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		params.put(CommonConstant.REDIS.KEY_FIELD, request.getField());
		
		return params;
		
	}
}
