package com.fq.redis.command.impl.set;

import java.util.Map;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import com.alipay.api.internal.util.StringUtils;
import com.fq.common.constant.CommonConstant;
import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

@Service
public class SetCommand  extends BaseCommand implements ICommand<String>{

	@Override
	public BaseResponse<String> execute(Jedis jedis ,Map<String,Object> req) {
		
		
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		String value = (String)req.get(CommonConstant.REDIS.KEY_VALUE) ;
		String ex = (String)req.get(CommonConstant.REDIS.KEY_EX) ;
		String result = null ;
		if(StringUtils.isEmpty(ex)){
			result = jedis.set(key, value) ;
		}else{
			result =jedis.setex(key, Integer.parseInt(ex), value) ;
		}
		
		SetResponse rep = (SetResponse)ResponseFactoryContext.get(SetCommand.class).build(req, result) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		String key = req.get(CommonConstant.REDIS.KEY_KEY).toString() ;
		String value = (String)req.get("value") ;
		
		t.set(key, value);
		
	}

}
