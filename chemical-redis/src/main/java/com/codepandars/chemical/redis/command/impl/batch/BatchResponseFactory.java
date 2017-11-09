package com.codepandars.chemical.redis.command.impl.batch;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ResponseFactory;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

@Service
public class BatchResponseFactory implements ResponseFactory{

	@Override
	@PostConstruct
	public void init() {
		ResponseFactoryContext.register(BatchCommand.class, this);
	}

	@Override
	public BaseResponse<?> build(Map<String, Object> req, Object data) {
		BatchResponse response = new BatchResponse(req,data);
		return response ;
	}
	
}
