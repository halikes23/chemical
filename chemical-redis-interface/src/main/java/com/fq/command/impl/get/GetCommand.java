package com.fq.command.impl.get;

import java.util.HashMap;
import java.util.Map;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.CommonConstant;

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
