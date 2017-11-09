package com.codepandars.chemical.redis.command.impl.incr;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

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
