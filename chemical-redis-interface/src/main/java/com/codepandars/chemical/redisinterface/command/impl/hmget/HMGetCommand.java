package com.codepandars.chemical.redisinterface.command.impl.hmget;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import net.sf.json.JSONObject;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.BaseConstant;
import com.fq.common.constant.CommonConstant;

public class HMGetCommand extends BaseCommand<HMGetRequest,HMGetResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public HMGetCommand(HMGetRequest request){
		super(request);
	}

	@Override
	protected HMGetResponse buildResponse(String response) {
		
		logger.debug(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (HMGetResponse)JSONObject.toBean(jsonObj,HMGetResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		params.put(CommonConstant.REDIS.KEY_FIELDS,request.getFields() );
		
		return params;
		
	}
}
