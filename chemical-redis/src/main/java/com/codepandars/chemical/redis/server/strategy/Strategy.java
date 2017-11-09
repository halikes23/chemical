package com.codepandars.chemical.redis.server.strategy;

import java.util.List;

import com.codepandars.chemical.redis.server.RedisServer;

/**
 * 
 * @author zhen.cheng
 *
 * @param <P> 参数类型
 * @param <R> 返回类型
 */
public interface Strategy<P,R> {

	public R get(P p,List<RedisServer> servers , RedisServer master);
	
}
