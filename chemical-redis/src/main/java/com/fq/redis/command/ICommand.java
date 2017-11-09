package com.fq.redis.command;

import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;


public interface ICommand<Data> {

	boolean isWrite() ;
	
	BaseResponse execute( Jedis jedis ,Map<String,Object> req) ;
	
	void execute( Transaction t ,Map<String,Object> req) ;
	
}
