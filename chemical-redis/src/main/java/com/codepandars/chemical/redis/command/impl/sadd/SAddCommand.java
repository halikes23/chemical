package com.codepandars.chemical.redis.command.impl.sadd;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;
import com.fq.common.constant.BaseConstant;
import com.fq.common.constant.CommonConstant;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("sAddCommand")
public class SAddCommand  extends BaseCommand implements ICommand<Long>{

	
	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		
		String[] members = ((String)req.get(CommonConstant.REDIS.KEY_MEMBERS)).split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) ;
		
		Long count = jedis.sadd(key, members) ;
		
		SAddResponse rep = (SAddResponse)ResponseFactoryContext.get(SAddCommand.class).build(req, count) ;
		
//		rep.put(CommonConstant.REDIS.KEY_COUNT, count) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {

		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		
		String[] members = ((String)req.get(CommonConstant.REDIS.KEY_MEMBERS)).split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) ;
		
		t.sadd(key, members) ;
		
	}

}
