package com.fq.redis.command.impl.batch;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ResponseFactory;
import com.fq.redis.command.ResponseFactoryContext;

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
