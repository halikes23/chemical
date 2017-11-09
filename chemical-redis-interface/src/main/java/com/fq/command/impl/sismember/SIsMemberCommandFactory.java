package com.fq.command.impl.sismember;

import java.util.Date;

import com.fq.command.BaseRequest;
import com.fq.command.CommandFactory;
import com.fq.command.ICommand;

public class SIsMemberCommandFactory extends CommandFactory{

	@Override
	public ICommand build(BaseRequest request) {
		
		request.setStimestamp(String.valueOf(new Date().getTime()));
		
		return new SIsMemberCommand((SIsMemberRequest)request);
	}
	
}
