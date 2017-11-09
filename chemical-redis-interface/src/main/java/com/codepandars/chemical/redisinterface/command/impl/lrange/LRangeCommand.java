package com.codepandars.chemical.redisinterface.command.impl.lrange;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.codepandars.chemical.redisinterface.command.BaseCommand;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.fq.common.constant.CommonConstant;

public class LRangeCommand extends BaseCommand<LRangeRequest,LRangeResponse> implements ICommand{

	private final static String KEY_LIST = "list" ;
	
	public LRangeCommand(LRangeRequest request){
		super(request);
	}

	@Override
	protected LRangeResponse buildResponse(String strResponse) {
		
		logger.info(strResponse);
		
		JSONObject jsonObj = JSONObject.fromObject(strResponse) ;
		
		LRangeResponse response = (LRangeResponse)JSONObject.toBean(jsonObj,LRangeResponse.class);
		
		List<String> list = new ArrayList<String>();
		if(jsonObj.get(KEY_LIST) != null){
			JSONArray ja = jsonObj.getJSONArray(KEY_LIST) ;
			
			for( int i = 0 ; i < ja.size() ; i ++ ){
				String obj = ja.get(i).toString() ;
				list.add(obj) ;
			}
			
		}
		response.setList(list);
		
		return response ;
	}

	@Override
	protected Map<String,String> buildParameters(){
		
		Map<String,String> params = new HashMap<String,String>() ;
		
		params.put(CommonConstant.REDIS.KEY_KEY, request.getKey()) ;
		params.put("start", request.getStart()) ;
		params.put("stop", request.getStop()) ;
		
		return params;
		
	}


}
