package com.codepandars.chemical.redis.command;

public enum CommandEnum {

	INCR("incr"),LPUSH("lpush"),LRANGE("lrange"),RPOP("rpop"),LLEN("llen"),SET("set"),GET("get"),
	SADD("sadd"),SISMEMBER("sismember"),HGETALL("hgetall"),HINCRBY("hincrby"),BATCH("batch"),DEL("del"),
	HSET("hset"),HGET("hget"),SMEMBERS("smembers"),HMGET("hmget"),HMSET("hmset"),LTRIM("ltrim");
	
	private String commandType ;
	
	private CommandEnum(String commandType){
		this.commandType = commandType ;
	}

	public String getCommandType() {
		return commandType;
	}
	
}
