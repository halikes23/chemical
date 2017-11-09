package com.fq.command.impl.batch;

import java.util.HashMap;
import java.util.Map;

import com.fq.command.BaseCommand;
import com.fq.command.ICommand;
import com.fq.command.ResponseBuilderContext;
import com.fq.common.constant.CommonConstant;

import net.sf.json.JSONArray;

public class BatchCommand extends BaseCommand<BatchRequest,BatchResponse> implements ICommand{

	public BatchCommand(BatchRequest request){
		super(request);
	}

	@Override
	protected BatchResponse buildResponse(String response) {
		
		logger.debug(response);
		return (BatchResponse)ResponseBuilderContext.get(CommonConstant.REDIS.COMMAND_TYPE.BATCH).build(response) ;
		
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		JSONArray jsonArray = JSONArray.fromObject(request.getRequests()) ;
		
		params.put("requests", jsonArray.toString()) ;
		
		return params;
		
	}
}
