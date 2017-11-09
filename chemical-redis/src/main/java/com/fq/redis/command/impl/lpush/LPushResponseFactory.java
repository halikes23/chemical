package com.fq.redis.command.impl.lpush;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ResponseFactory;
import com.fq.redis.command.ResponseFactoryContext;

@Service
public class LPushResponseFactory implements ResponseFactory {

	@Override
	@PostConstruct
	public void init() {
		ResponseFactoryContext.register(LPushCommand.class, this);	
	}

	@Override
	public BaseResponse<?> build(Map<String, Object> req, Object data) {
		return new LPushResponse(req, data);
	}

}
