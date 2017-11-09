package com.fq.redis.server;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisServer{
	
	private JedisPool jedisPool ;
	
	public final static String ROLE_MASTER = "1" ;
	
	public final static String ROLE_SLAVE = "2" ;
	
	/**
	 * 服务地址 ip:port
	 */
	private String addr ;
	
	/**
	 * redis服务主从标记 1：主数据库 2：从数据库
	 */
	private String role = ROLE_MASTER ;
	
	/**
	 * REDIS基本访问URL
	 */
	private String accessBaseUrl ;

	private RedisServer(){
		
	}
	
	public static RedisServer build(String addr , String accessBaseUrl ,JedisPool jedisPool ){
		RedisServer redisServer = new RedisServer() ;
		redisServer.addr = addr ;
		redisServer.accessBaseUrl = accessBaseUrl ;
		redisServer.jedisPool = jedisPool ;
		return redisServer ;
	}
	
	public String getAddr() {
		return addr;
	}

	public String getRole() {
		return role;
	}


	public String getAccessBaseUrl() {
		return accessBaseUrl;
	}

//	public JedisPool getJedisPool() {
//		return jedisPool;
//	}

	public Jedis getConnection(){
		return this.jedisPool.getResource() ;
	}
	
	public void closeConnection(Jedis jedis , boolean broken){
		if (broken) {
            jedisPool.returnBrokenResource(jedis);
        } else {
            jedisPool.returnResource(jedis);
        }
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedisServer other = (RedisServer) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

}
