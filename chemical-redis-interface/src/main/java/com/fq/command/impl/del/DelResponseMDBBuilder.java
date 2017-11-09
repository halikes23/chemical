package com.fq.command.impl.del;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.fq.command.BaseResponse;
import com.fq.command.IResponseBuilder;
import com.fq.command.ResponseBuilderContext;
import com.fq.common.constant.CommonConstant;

import net.sf.ezmorph.bean.MorphDynaBean;

@Service
public class DelResponseMDBBuilder implements IResponseBuilder{

	@PostConstruct
	public void register(){
		ResponseBuilderContext.register(CommonConstant.REDIS.PRE_MDB + CommonConstant.REDIS.COMMAND_TYPE.DEL, this);
	}

	@Override
	public BaseResponse build(Object response) {
		
		MorphDynaBean mdb = (MorphDynaBean)response ;
		
		return new DelResponse(mdb);
		
	}
	
}
