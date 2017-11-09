package com.codepandars.chemical.redis.command.impl.del;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;
import com.fq.common.constant.CommonConstant;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service
public class DelCommand extends BaseCommand implements ICommand<Long>{

	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		
		Long result = jedis.del(key) ;
		
		DelResponse rep = (DelResponse)ResponseFactoryContext.get(DelCommand.class).build(req, result);
		
		return rep;
	}
	
	@Override
	public void execute(Transaction t ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		
		t.del(key);
		
	}
	
	public boolean isWrite() {
		return true;
	}

	
}
