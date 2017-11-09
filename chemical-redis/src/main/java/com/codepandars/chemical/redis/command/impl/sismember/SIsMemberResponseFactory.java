package com.codepandars.chemical.redis.command.impl.sismember;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ResponseFactory;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

@Service
public class SIsMemberResponseFactory implements ResponseFactory {

	@Override
	@PostConstruct
	public void init() {
		ResponseFactoryContext.register(SIsMemberCommand.class, this);	
	}

	@Override
	public BaseResponse<?> build(Map<String, Object> req, Object data) {
		return new SIsMemberResponse(req, data);
	}

}
