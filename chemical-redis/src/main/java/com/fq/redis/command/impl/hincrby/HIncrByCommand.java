package com.fq.redis.command.impl.hincrby;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

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
