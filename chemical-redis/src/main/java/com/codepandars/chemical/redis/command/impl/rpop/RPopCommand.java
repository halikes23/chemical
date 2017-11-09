package com.codepandars.chemical.redis.command.impl.rpop;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("rPopCommand")
public class RPopCommand extends BaseCommand implements ICommand<String>{

	@Override
	public BaseResponse<String> execute(Jedis jedis ,Map<String,Object> req) {
		
		
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		
		String value = jedis.rpop(key) ;
		
		RPopResponse rep = (RPopResponse)ResponseFactoryContext.get(RPopCommand.class).build(req, value) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		
		t.rpop(key) ;

	}
	
	public boolean isWrite() {
		return false;
	}

}
