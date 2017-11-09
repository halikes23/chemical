package com.codepandars.chemical.redisinterface.command.impl.rpop;

import java.util.Date;

import com.codepandars.chemical.redisinterface.command.BaseRequest;
import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;

public class RPopCommandFactory extends CommandFactory{

	public ICommand build(BaseRequest request) {
		
		request.setStimestamp(String.valueOf(new Date().getTime()));
		
		return new RPopCommand((RPopRequest)request);
	}
	
}
