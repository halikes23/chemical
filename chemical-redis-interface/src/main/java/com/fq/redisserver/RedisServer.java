package com.fq.redisserver;

import com.fq.constant.RedisInterfaceConstant;

public class RedisServer {

	/**
	 * 服务地址 ip:port
	 */
	private String addr ;
	
	/**
	 * REDIS基本访问URL
	 */
	private String accessBaseUrl ;
	
	public RedisServer(String addr){
		this.addr = addr ;
		this.accessBaseUrl = RedisInterfaceConstant.HTTP + addr + RedisInterfaceConstant.BASE_ACTION ;
	}
	
	
	public String getAddr() {
		return addr;
	}

	public String getAccessBaseUrl() {
		return accessBaseUrl;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addr == null) ? 0 : addr.hashCode());
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
		return true;
	}
	
	
	
}
