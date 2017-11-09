package com.fq.redis.command.impl.del;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ResponseFactory;
import com.fq.redis.command.ResponseFactoryContext;

@Service
public class DelResponseFactory implements ResponseFactory{


	@Override
	@PostConstruct
	public void init() {
		ResponseFactoryContext.register(DelCommand.class, this);
	}

	@Override
	public BaseResponse<?> build(Map<String, Object> req, Object data) {
		DelResponse response = new DelResponse(req,data);
		return response ;
	}

	
	
}
