package com.fq.command.impl.ltrim;

import java.util.HashMap;
import java.util.Map;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class LTrimCommand extends BaseCommand<LTrimRequest,LTrimResponse> implements ICommand{

	public LTrimCommand(LTrimRequest request){
		super(request);
	}
	

	@Override
	protected LTrimResponse buildResponse(String response) {
		
		logger.debug(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (LTrimResponse)JSONObject.toBean(jsonObj,LTrimResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		params.put(CommonConstant.REDIS.KEY_START, request.getStart()) ;
		
		params.put(CommonConstant.REDIS.KEY_STOP, request.getStop()) ;
		
		return params;
		
	}
}
