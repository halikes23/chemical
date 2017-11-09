package com.fq.command.impl.batch;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fq.command.BaseResponse;
import com.fq.command.IResponseBuilder;
import com.fq.command.ResponseBuilderContext;
import com.fq.common.constant.CommonConstant;

import net.sf.ezmorph.bean.MorphDynaBean;
import net.sf.json.JSONObject;

@Service
public class BatchResponseBuilder implements IResponseBuilder{

	@PostConstruct
	public void register(){
		ResponseBuilderContext.register(CommonConstant.REDIS.COMMAND_TYPE.BATCH, this);
	}

	@Override
	public BaseResponse build(Object response) {
		
		JSONObject jsonObj = JSONObject.fromObject(response) ;
		
		BatchResponse batchResponse = (BatchResponse)JSONObject.toBean(jsonObj,BatchResponse.class);
		
		List<MorphDynaBean> mdbReponses = (List<MorphDynaBean>)batchResponse.getResponses() ;
		
		List<BaseResponse> responses = new ArrayList<BaseResponse>() ;
		
		for( MorphDynaBean mdbResponse : mdbReponses ){
			String commandType = mdbResponse.get(CommonConstant.REDIS.KEY_COMMAND_TYPE).toString() ;
			BaseResponse baseResponse = ResponseBuilderContext.get(CommonConstant.REDIS.PRE_MDB+commandType).build(mdbResponse) ;
			
			responses.add(baseResponse) ;
		}
		batchResponse.setResponses(responses);
		
		return batchResponse ;
		
	}
	
}
