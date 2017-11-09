package com.fq.redis.command.impl.lrang;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("lRangeCommand")
public class LRangeCommand extends BaseCommand implements ICommand<List<String>>{

	@Override
	public BaseResponse<List<String>> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		Long start = Long.parseLong( req.get(CommonConstant.REDIS.KEY_START).toString() ) ;
		Long stop = Long.parseLong( req.get(CommonConstant.REDIS.KEY_STOP).toString() ) ;
		
		List<String> list = jedis.lrange(key, start, stop) ;
		
		LRangeResponse rep = (LRangeResponse)ResponseFactoryContext.get(LRangeCommand.class).build(req,list) ;
			
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		Long start = Long.parseLong( req.get(CommonConstant.REDIS.KEY_START).toString() ) ;
		Long stop = Long.parseLong( req.get(CommonConstant.REDIS.KEY_STOP).toString() ) ;
		
		t.lrange(key, start, stop);
		
		
	}
	
	public boolean isWrite() {
		return false;
	}
	
}
