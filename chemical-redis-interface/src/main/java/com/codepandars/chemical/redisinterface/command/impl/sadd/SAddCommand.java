package com.codepandars.chemical.redisinterface.command.impl.sadd;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.BaseConstant;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONObject;

public class SAddCommand extends BaseCommand<SAddRequest,SAddResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public SAddCommand(SAddRequest request){
		super(request);
	}
	

	@Override
	protected SAddResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (SAddResponse)JSONObject.toBean(jsonObj,SAddResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		String members = StringUtils.join(request.getMembers(), BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) ;
		
		params.put("members", members) ;
		
		return params;
		
	}
}
