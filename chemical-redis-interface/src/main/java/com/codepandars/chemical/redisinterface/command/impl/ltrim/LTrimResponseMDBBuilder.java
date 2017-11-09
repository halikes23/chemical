package com.codepandars.chemical.redisinterface.command.impl.ltrim;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redisinterface.command.BaseResponse;
import com.codepandars.chemical.redisinterface.command.IResponseBuilder;
import com.codepandars.chemical.redisinterface.command.ResponseBuilderContext;
import com.fq.common.constant.CommonConstant;

import net.sf.ezmorph.bean.MorphDynaBean;

@Service
public class LTrimResponseMDBBuilder implements IResponseBuilder{

	@PostConstruct
	public void register(){
		ResponseBuilderContext.register(CommonConstant.REDIS.PRE_MDB + CommonConstant.REDIS.COMMAND_TYPE.LTRIM, this);
	}

	@Override
	public BaseResponse build(Object response) {
		
		MorphDynaBean mdb = (MorphDynaBean)response ;
		
		return new LTrimResponse(mdb);
		
	}
	
}
