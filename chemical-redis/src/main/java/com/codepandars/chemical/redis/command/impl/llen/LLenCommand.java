package com.codepandars.chemical.redis.command.impl.llen;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;
import com.fq.common.constant.CommonConstant;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("lLenCommand")
public class LLenCommand extends BaseCommand implements ICommand<Long>{

	@Override
	public BaseResponse<Long> execute(Jedis jedis ,Map<String,Object> req) {
		
		
			
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		
		Long length = jedis.llen(key) ;
		
		LLenResponse rep = (LLenResponse)ResponseFactoryContext.get(LLenCommand.class).build(req, length);
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		
		t.llen(key).get() ;
		
	}
	
	public boolean isWrite() {
		return true;
	}

}
