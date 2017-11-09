package com.fq.redis.command.impl.hgetall;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("hGetAllCommand")
public class HGetAllCommand  extends BaseCommand implements ICommand<Map<String,String>>{

	@Override
	public BaseResponse<Map<String,String>> execute(Jedis jedis ,Map<String,Object> req) {
		
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		
		Map<String,String> result = jedis.hgetAll(key) ;
		
		HGetAllResponse rep = (HGetAllResponse)ResponseFactoryContext.get(HGetAllCommand.class).build(req, result) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY) ;
		
		t.hgetAll(key) ;
		
	}
	
	public boolean isWrite() {
		return false;
	}

	
}
