package com.codepandars.chemical.redisinterface.command.impl.lpush;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.codepandars.chemical.common.constant.BaseConstant;
import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;

import net.sf.json.JSONObject;

public class LPushCommand extends BaseCommand<LPushRequest,LPushResponse> implements ICommand{

	public final boolean isWrite = true ;
	
	public LPushCommand(LPushRequest request){
		super(request);
	}

	@Override
	protected LPushResponse buildResponse(String response) {
		
		logger.info(response);
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		return (LPushResponse)JSONObject.toBean(jsonObj,LPushResponse.class);
	}

	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		
		String values = StringUtils.join(request.getValues(), BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) ;
		
		params.put( "values", values ) ;
		
		return params;
		
	}

}
