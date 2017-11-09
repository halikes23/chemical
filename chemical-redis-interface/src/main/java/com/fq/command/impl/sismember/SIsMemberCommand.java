package com.fq.command.impl.sismember;

import java.util.HashMap;
import java.util.Map;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class SIsMemberCommand extends BaseCommand<SIsMemberRequest,SIsMemberResponse> implements ICommand{

	public SIsMemberCommand(SIsMemberRequest request){
		super(request);
	}
	

	@Override
	protected SIsMemberResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (SIsMemberResponse)JSONObject.toBean(jsonObj,SIsMemberResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		params.put("member", request.getMember()) ;
		
		return params;
		
	}
}
