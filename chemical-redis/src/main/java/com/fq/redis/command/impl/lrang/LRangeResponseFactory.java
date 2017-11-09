package com.fq.redis.command.impl.lrang;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ResponseFactory;
import com.fq.redis.command.ResponseFactoryContext;

@Service
public class LRangeResponseFactory implements ResponseFactory {

	@Override
	@PostConstruct
	public void init() {
		ResponseFactoryContext.register(LRangeCommand.class, this);	
	}

	@Override
	public BaseResponse<?> build(Map<String, Object> req, Object data) {
		return new LRangeResponse(req, data);
	}

}
