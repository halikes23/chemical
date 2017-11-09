package com.fq.redis.command.impl.hget;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ResponseFactory;
import com.fq.redis.command.ResponseFactoryContext;

@Service
public class HGetResponseFactory implements ResponseFactory{

	@Override
	@PostConstruct
	public void init() {
		ResponseFactoryContext.register(HGetCommand.class, this );
	}

	@Override
	public BaseResponse<?> build(Map<String, Object> req, Object data) {
		HGetResponse response = new HGetResponse(req,data) ;
		return response ;
	}

	
	
}
