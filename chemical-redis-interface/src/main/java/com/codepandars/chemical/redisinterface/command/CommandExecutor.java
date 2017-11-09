package com.codepandars.chemical.redisinterface.command;

public class CommandExecutor {

	public final static BaseResponse execute( ICommand command){
		return command.execute() ;
	}
	
}
