package com.codepandars.chemical.redisinterface.command;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.codepandars.chemical.redisinterface.command.impl.batch.BatchCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.batch.BatchRequest;
import com.codepandars.chemical.redisinterface.command.impl.del.DelCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.del.DelRequest;
import com.codepandars.chemical.redisinterface.command.impl.get.GetCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.get.GetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hget.HGetCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.hget.HGetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hgetall.HGetAllCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.hgetall.HGetAllRequest;
import com.codepandars.chemical.redisinterface.command.impl.hincrby.HIncrByCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.hincrby.HIncrByRequest;
import com.codepandars.chemical.redisinterface.command.impl.hmget.HMGetCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.hmget.HMGetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hmset.HMSetCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.hmset.HMSetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hset.HSetCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.hset.HSetRequest;
import com.codepandars.chemical.redisinterface.command.impl.incr.IncrCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.incr.IncrRequest;
import com.codepandars.chemical.redisinterface.command.impl.llen.LLenCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.llen.LLenRequest;
import com.codepandars.chemical.redisinterface.command.impl.lpush.LPushCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.lpush.LPushRequest;
import com.codepandars.chemical.redisinterface.command.impl.lrange.LRangeCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.lrange.LRangeRequest;
import com.codepandars.chemical.redisinterface.command.impl.ltrim.LTrimCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.ltrim.LTrimRequest;
import com.codepandars.chemical.redisinterface.command.impl.rpop.RPopCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.rpop.RPopRequest;
import com.codepandars.chemical.redisinterface.command.impl.sadd.SAddCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.sadd.SAddRequest;
import com.codepandars.chemical.redisinterface.command.impl.set.SetCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.set.SetRequest;
import com.codepandars.chemical.redisinterface.command.impl.sismember.SIsMemberCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.sismember.SIsMemberRequest;
import com.codepandars.chemical.redisinterface.command.impl.smembers.SMembersCommandFactory;
import com.codepandars.chemical.redisinterface.command.impl.smembers.SMembersRequest;

public abstract class CommandFactory {

	public final static Map<Class<? extends BaseRequest>,CommandFactory> REQUEST_COMMANDFACTORY_MAPPING ;
	
	static{
		Map<Class<? extends BaseRequest>,CommandFactory> temp = new HashMap<Class<? extends BaseRequest>,CommandFactory>() ;
		
		temp.put(IncrRequest.class, new IncrCommandFactory() ) ;
		
		temp.put(LLenRequest.class, new LLenCommandFactory() ) ;
		
		temp.put(LPushRequest.class, new LPushCommandFactory() ) ;
		
		temp.put(LRangeRequest.class, new LRangeCommandFactory() ) ;
		
		temp.put(RPopRequest.class, new RPopCommandFactory() ) ;
		
		temp.put(GetRequest.class, new GetCommandFactory() ) ;
		
		temp.put(SetRequest.class, new SetCommandFactory() ) ;
		
		temp.put(SAddRequest.class, new SAddCommandFactory() ) ;
		
		temp.put(SIsMemberRequest.class, new SIsMemberCommandFactory() ) ;
		
		temp.put(HGetAllRequest.class, new HGetAllCommandFactory() ) ;
		
		temp.put(HIncrByRequest.class, new HIncrByCommandFactory() ) ;
		
		temp.put(BatchRequest.class, new BatchCommandFactory() ) ;
		
		temp.put(DelRequest.class, new DelCommandFactory() ) ;
		
		temp.put(HSetRequest.class, new HSetCommandFactory() ) ;
		
		temp.put(HGetRequest.class, new HGetCommandFactory() ) ;
		
		temp.put(SMembersRequest.class, new SMembersCommandFactory() ) ;
		
		temp.put(HMGetRequest.class, new HMGetCommandFactory() ) ;
		
		temp.put(HMSetRequest.class, new HMSetCommandFactory() ) ;
		
		temp.put(LTrimRequest.class, new LTrimCommandFactory() ) ;
		
		REQUEST_COMMANDFACTORY_MAPPING = Collections.unmodifiableMap(temp) ;
	}
	
	public final static CommandFactory getFactory(BaseRequest request){
		return REQUEST_COMMANDFACTORY_MAPPING.get(request.getClass()) ;
	}
	
	public abstract ICommand build(BaseRequest request) ;
	
}
