package com.codepandars.chemical.redisinterface.command.impl.llen;

import java.util.Date;

import com.codepandars.chemical.redisinterface.command.BaseRequest;
import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;

public class LLenCommandFactory extends CommandFactory{

	@Override
	public ICommand build(BaseRequest request) {
		request.setStimestamp(String.valueOf(new Date().getTime()));
		return new LLenCommand((LLenRequest)request);
	}
	
}
