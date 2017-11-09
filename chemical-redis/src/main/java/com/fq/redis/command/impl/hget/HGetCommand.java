package com.fq.redis.command.impl.hget;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("hGetCommand")
public class HGetCommand  extends BaseCommand implements ICommand<String>{

	@Override
	public BaseResponse<String> execute(Jedis jedis ,Map<String,Object> req) {
		
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String field = (String)req.get(CommonConstant.REDIS.KEY_FIELD);
		
		String value = jedis.hget(key, field) ;
		
		return (HGetResponse)ResponseFactoryContext.get(HGetCommand.class).build(req, value) ;
		
	}
	
	@Override
	public void execute(Transaction t ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String field = (String)req.get(CommonConstant.REDIS.KEY_FIELD);
		
		t.hget(key, field) ;
		
	}
	
	public boolean isWrite() {
		return false;
	}
	
}
