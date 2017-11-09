package com.fq.redis.command.impl.incr;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("incrCommand")
public class IncrCommand extends BaseCommand implements ICommand<Long>{

	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		
			
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString();
		
		Long newValue = jedis.incr( key ) ;
		
		IncrResponse rep = (IncrResponse)ResponseFactoryContext.get(IncrCommand.class).build(req, newValue) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString();
		
		t.incr( key );
		
	}
	
	public boolean isWrite() {
		return true;
	}
	
}
