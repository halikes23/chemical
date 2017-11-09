package com.codepandars.chemical.redis.command.impl.lpush;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.common.constant.BaseConstant;
import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("lPushCommand")
public class LPushCommand extends BaseCommand implements ICommand<Long>{

	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
			
		String[] values = req.get("values").toString().split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) ;
			
		Long count = jedis.lpush(key, values) ;
		
		LPushResponse rep = (LPushResponse)ResponseFactoryContext.get(LPushCommand.class).build(req, count);
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
			
		String[] values = req.get("values").toString().split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) ;
			
		t.lpush(key, values);
		
	}
	
}
