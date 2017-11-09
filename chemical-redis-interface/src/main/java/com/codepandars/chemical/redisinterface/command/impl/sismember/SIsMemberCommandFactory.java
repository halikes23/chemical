package com.codepandars.chemical.redisinterface.command.impl.sismember;

import java.util.Date;

import com.codepandars.chemical.redisinterface.command.BaseRequest;
import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;

public class SIsMemberCommandFactory extends CommandFactory{

	@Override
	public ICommand build(BaseRequest request) {
		
		request.setStimestamp(String.valueOf(new Date().getTime()));
		
		return new SIsMemberCommand((SIsMemberRequest)request);
	}
	
}
