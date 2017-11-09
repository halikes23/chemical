package com.fq.command.impl.lpush;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.BaseConstant;
import com.fq.common.constant.CommonConstant;

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
