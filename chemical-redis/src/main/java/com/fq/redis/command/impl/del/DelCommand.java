package com.fq.redis.command.impl.del;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

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
