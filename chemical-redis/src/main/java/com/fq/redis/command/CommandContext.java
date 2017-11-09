package com.fq.redis.command;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandContext {

	public static Map<String,ICommand> COMMANDS ;
	
	@Autowired
	private ICommand incrCommand;
	
	@Autowired
	private ICommand lPushCommand ;
	
	@Autowired
	private ICommand lRangeCommand ;
	
	@Autowired
	private ICommand rPopCommand ;
	
	@Autowired
	private ICommand lLenCommand ;
	
	@Autowired
	private ICommand setCommand ;
	
	@Autowired
	private ICommand getCommand ;
	
	@Autowired
	private ICommand sAddCommand ;
	
	@Autowired
	private ICommand sIsMemberCommand ;
	
	@Autowired
	private ICommand hGetAllCommand ;
	
	@Autowired
	private ICommand hIncrByCommand ;
	
	@Autowired
	private ICommand batchCommand ;
	
	@Autowired
	private ICommand delCommand ;
	
	@Autowired
	private ICommand hSetCommand ;
	
	@Autowired
	private ICommand hGetCommand ;
	
	@Autowired
	private ICommand sMembersCommand ;
	
	@Autowired
	private ICommand hMGetCommand ;
	
	@Autowired
	private ICommand hMSetCommand ;
	
	@Autowired
	private ICommand lTrimCommand ;
	
	@PostConstruct
	public void init(){
		Map<String,ICommand> commands = new HashMap<String,ICommand>() ;
		
		commands.put(CommandEnum.INCR.getCommandType()		, incrCommand) ;
		commands.put(CommandEnum.LPUSH.getCommandType()		, lPushCommand ) ;
		commands.put(CommandEnum.LRANGE.getCommandType()	, lRangeCommand ) ;
		commands.put(CommandEnum.RPOP.getCommandType()		, rPopCommand ) ;
		commands.put(CommandEnum.LLEN.getCommandType()		, lLenCommand ) ;
		commands.put(CommandEnum.SET.getCommandType()		, setCommand ) ;
		commands.put(CommandEnum.GET.getCommandType()		, getCommand ) ;
		commands.put(CommandEnum.SADD.getCommandType()		, sAddCommand) ;
		commands.put(CommandEnum.SISMEMBER.getCommandType()	, sIsMemberCommand) ;
		commands.put(CommandEnum.HGETALL.getCommandType()	, hGetAllCommand) ;
		commands.put(CommandEnum.HINCRBY.getCommandType()	, hIncrByCommand) ;
		commands.put(CommandEnum.BATCH.getCommandType()		, batchCommand) ;
		commands.put(CommandEnum.DEL.getCommandType()		, delCommand) ;
		commands.put(CommandEnum.HSET.getCommandType()		, hSetCommand) ;
		commands.put(CommandEnum.HGET.getCommandType()		, hGetCommand) ;
		commands.put(CommandEnum.SMEMBERS.getCommandType()	, sMembersCommand) ;
		commands.put(CommandEnum.HMGET.getCommandType()		, hMGetCommand) ;
		commands.put(CommandEnum.HMSET.getCommandType()		, hMSetCommand) ;
		commands.put(CommandEnum.LTRIM.getCommandType()		, lTrimCommand) ;
		COMMANDS = Collections.unmodifiableMap(commands) ;
	}
	
	public final static ICommand<?> getCommand(Map<String,Object> request){
		
		return COMMANDS.get(request.get("commandType")) ;
		
	}
	
}
