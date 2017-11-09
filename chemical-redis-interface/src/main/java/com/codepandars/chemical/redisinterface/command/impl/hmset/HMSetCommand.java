package com.codepandars.chemical.redisinterface.command.impl.hmset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import com.codepandars.chemical.common.constant.BaseConstant;
import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;

import net.sf.json.JSONObject;

public class HMSetCommand extends BaseCommand<HMSetRequest,HMSetResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public HMSetCommand(HMSetRequest request){
		super(request);
	}

	@Override
	protected HMSetResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (HMSetResponse)JSONObject.toBean(jsonObj,HMSetResponse.class);
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		params.put( CommonConstant.REDIS.KEY_FIELDS_AND_VALUES, StringUtils.join(request.getFieldsAndValues(),BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) );
		
		return params;
		
	}
}
