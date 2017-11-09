package com.codepandars.chemical.redis.command.impl.hgetall;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

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
