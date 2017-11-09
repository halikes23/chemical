package com.fq.command.impl.hgetall;

import java.util.HashMap;
import java.util.Map;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.CommonConstant;

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
