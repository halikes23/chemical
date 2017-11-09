package com.fq.command.impl.del;

import java.util.HashMap;
import java.util.Map;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class DelCommand extends BaseCommand<DelRequest,DelResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public DelCommand(DelRequest request){
		super(request);
	}
	

	@Override
	protected DelResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (DelResponse)JSONObject.toBean(jsonObj,DelResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		return params;
		
	}
}
