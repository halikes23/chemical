package com.codepandars.chemical.redis.command.impl.hmget;

import java.util.List;
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

@Service("hMGetCommand")
public class HMGetCommand  extends BaseCommand implements ICommand<List<String>>{

	@Override
	public BaseResponse<List<String>> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String[] fields = ((String)req.get(CommonConstant.REDIS.KEY_FIELDS)).split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL,-1);
		
		List<String> values = jedis.hmget(key, fields) ;
		
		return (HMGetResponse)ResponseFactoryContext.get(HMGetCommand.class).build(req, values) ;
		
	}
	
	@Override
	public void execute(Transaction t ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String[] fields = ((String)req.get(CommonConstant.REDIS.KEY_FIELDS)).split(BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL,-1);
		
		t.hmget(key, fields) ;
		
	}
	
	public boolean isWrite() {
		return false;
	}
	
}
