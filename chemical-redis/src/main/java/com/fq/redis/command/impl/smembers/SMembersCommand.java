package com.fq.redis.command.impl.smembers;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("sMembersCommand")
public class SMembersCommand  extends BaseCommand implements ICommand<Set<String>>{

	@Override
	public BaseResponse<Set<String>> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		
		Set<String> members = jedis.smembers(key) ;
		
		SMembersResponse rep = (SMembersResponse)ResponseFactoryContext.get(SMembersCommand.class).build(req, members) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		t.smembers(key) ;
		
	}
	
	public boolean isWrite() {
		return false;
	}


}
