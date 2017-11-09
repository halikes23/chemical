package com.fq.redis.command.impl.hset;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("hSetCommand")
public class HSetCommand  extends BaseCommand implements ICommand<Long>{

	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String field = (String)req.get(CommonConstant.REDIS.KEY_FIELD);
		String value = (String)req.get(CommonConstant.REDIS.KEY_VALUE) ;
		
		Long result = jedis.hset(key, field, value) ;

		HSetResponse rep = (HSetResponse)ResponseFactoryContext.get(HSetCommand.class).build(req, result) ;
		
		return rep;
	}
	
	@Override
	public void execute(Transaction t ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String field = (String)req.get(CommonConstant.REDIS.KEY_FIELD);
		String value = (String)req.get(CommonConstant.REDIS.KEY_VALUE) ;
		
		t.hset(key, field, value) ;
		
	}
	
	public boolean isWrite() {
		return true;
	}
	
}
