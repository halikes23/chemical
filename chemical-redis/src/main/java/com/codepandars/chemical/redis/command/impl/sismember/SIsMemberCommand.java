package com.codepandars.chemical.redis.command.impl.sismember;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redis.command.BaseCommand;
import com.codepandars.chemical.redis.command.BaseResponse;
import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.command.ResponseFactoryContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service("sIsMemberCommand")
public class SIsMemberCommand  extends BaseCommand implements ICommand<Boolean>{

	@Override
	public BaseResponse<Boolean> execute(Jedis jedis ,Map<String,Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String member = (String)req.get("member") ;
		
		Boolean result = jedis.sismember(key, member) ;
		
		SIsMemberResponse rep = (SIsMemberResponse)ResponseFactoryContext.get(SIsMemberCommand.class).build(req, result) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = (String)req.get(CommonConstant.REDIS.KEY_KEY)  ;
		String member = (String)req.get("member") ;
		t.sismember(key, member) ;
		
		
	}
	
	public boolean isWrite() {
		return false;
	}
	
}
