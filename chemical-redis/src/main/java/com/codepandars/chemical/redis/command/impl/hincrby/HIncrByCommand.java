package com.codepandars.chemical.redis.command.impl.hincrby;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;
import com.fq.common.constant.CommonConstant;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("hIncrByCommand")
public class HIncrByCommand  extends BaseCommand implements ICommand<Long>{

	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String field = (String)req.get("field")  ;
		Long value = req.get("value") == null ? 1L : Long.parseLong((String)req.get("value") ) ;
		
		Long result = jedis.hincrBy(key, field, value);
		
		HIncrByResponse rep = (HIncrByResponse)ResponseFactoryContext.get(HIncrByCommand.class).build(req, result) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {

		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String field = (String)req.get("field")  ;
		Integer value = Integer.parseInt((String)req.get("value") ) ;
		
		t.hincrBy(key, field, value);
		
	}
	
	public boolean isWrite() {
		return true;
	}

}
