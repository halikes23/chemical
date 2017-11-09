package com.codepandars.chemical.redis.command.impl.ltrim;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;
import com.fq.common.constant.CommonConstant;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("lTrimCommand")
public class LTrimCommand extends BaseCommand implements ICommand<String>{

	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		Long start = Long.parseLong( req.get(CommonConstant.REDIS.KEY_START).toString() ) ;
		Long stop = Long.parseLong( req.get(CommonConstant.REDIS.KEY_STOP).toString() ) ;

		String length = jedis.ltrim(key, start, stop) ;
		
		LTrimResponse rep = (LTrimResponse)ResponseFactoryContext.get(LTrimCommand.class).build(req,length) ;
			
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		Long start = Long.parseLong( req.get(CommonConstant.REDIS.KEY_START).toString() ) ;
		Long stop = Long.parseLong( req.get(CommonConstant.REDIS.KEY_STOP).toString() ) ;
		
		t.ltrim(key, start, stop);
		
		
	}
	
	public boolean isWrite() {
		return false;
	}
	
}
