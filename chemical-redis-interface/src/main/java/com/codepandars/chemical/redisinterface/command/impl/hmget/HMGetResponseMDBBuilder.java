package com.codepandars.chemical.redisinterface.command.impl.hmget;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.codepandars.chemical.redisinterface.command.BaseResponse;
import com.codepandars.chemical.redisinterface.command.IResponseBuilder;
import com.codepandars.chemical.redisinterface.command.ResponseBuilderContext;
import com.fq.common.constant.CommonConstant;

import net.sf.ezmorph.bean.MorphDynaBean;

@Service
public class HMGetResponseMDBBuilder implements IResponseBuilder{

	@PostConstruct
	public void register(){
		ResponseBuilderContext.register(CommonConstant.REDIS.PRE_MDB + CommonConstant.REDIS.COMMAND_TYPE.HMGET, this);
	}

	@Override
	public BaseResponse build(Object response) {
		
		MorphDynaBean mdb = (MorphDynaBean)response ;
		
		return new HMGetResponse(mdb);
		
	}
	
}
