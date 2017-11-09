package com.codepandars.chemical.redis.command.impl.hmget;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ResponseFactory;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

@Service
public class HMGetResponseFactory implements ResponseFactory {

	@Override
	@PostConstruct
	public void init() {
		ResponseFactoryContext.register(HMGetCommand.class, this);	
	}

	@Override
	public BaseResponse<?> build(Map<String, Object> req, Object data) {
		return new HMGetResponse(req, data);
	}

}
