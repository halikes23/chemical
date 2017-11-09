package com.fq.command.impl.hmset;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.common.constant.BaseConstant;
import com.fq.common.constant.CommonConstant;

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
