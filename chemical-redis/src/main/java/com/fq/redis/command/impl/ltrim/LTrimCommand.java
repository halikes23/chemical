package com.fq.redis.command.impl.ltrim;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

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
