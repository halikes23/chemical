package com.fq.command.impl.llen;

import java.util.Date;

import com.fq.command.BaseRequest;
import com.fq.command.CommandFactory;
import com.fq.command.ICommand;

public class LLenCommandFactory extends CommandFactory{

	@Override
	public ICommand build(BaseRequest request) {
		request.setStimestamp(String.valueOf(new Date().getTime()));
		return new LLenCommand((LLenRequest)request);
	}
	
}
