package com.fq.command;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fq.command.impl.batch.BatchCommandFactory;
import com.fq.command.impl.batch.BatchRequest;
import com.fq.command.impl.del.DelCommandFactory;
import com.fq.command.impl.del.DelRequest;
import com.fq.command.impl.get.GetCommandFactory;
import com.fq.command.impl.get.GetRequest;
import com.fq.command.impl.hget.HGetCommandFactory;
import com.fq.command.impl.hget.HGetRequest;
import com.fq.command.impl.hgetall.HGetAllCommandFactory;
import com.fq.command.impl.hgetall.HGetAllRequest;
import com.fq.command.impl.hincrby.HIncrByCommandFactory;
import com.fq.command.impl.hincrby.HIncrByRequest;
import com.fq.command.impl.hmget.HMGetCommandFactory;
import com.fq.command.impl.hmget.HMGetRequest;
import com.fq.command.impl.hmset.HMSetCommandFactory;
import com.fq.command.impl.hmset.HMSetRequest;
import com.fq.command.impl.hset.HSetCommandFactory;
import com.fq.command.impl.hset.HSetRequest;
import com.fq.command.impl.incr.IncrCommandFactory;
import com.fq.command.impl.incr.IncrRequest;
import com.fq.command.impl.llen.LLenCommandFactory;
import com.fq.command.impl.llen.LLenRequest;
import com.fq.command.impl.lpush.LPushCommandFactory;
import com.fq.command.impl.lpush.LPushRequest;
import com.fq.command.impl.lrange.LRangeCommandFactory;
import com.fq.command.impl.lrange.LRangeRequest;
import com.fq.command.impl.ltrim.LTrimCommandFactory;
import com.fq.command.impl.ltrim.LTrimRequest;
import com.fq.command.impl.rpop.RPopCommandFactory;
import com.fq.command.impl.rpop.RPopRequest;
import com.fq.command.impl.sadd.SAddCommandFactory;
import com.fq.command.impl.sadd.SAddRequest;
import com.fq.command.impl.set.SetCommandFactory;
import com.fq.command.impl.set.SetRequest;
import com.fq.command.impl.sismember.SIsMemberCommandFactory;
import com.fq.command.impl.sismember.SIsMemberRequest;
import com.fq.command.impl.smembers.SMembersCommandFactory;
import com.fq.command.impl.smembers.SMembersRequest;

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
