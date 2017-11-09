package com.fq.command.impl.lpush;

import java.util.Date;

import com.fq.command.BaseRequest;
import com.fq.command.CommandFactory;
import com.fq.command.ICommand;

public class LPushCommandFactory extends CommandFactory{

	public ICommand build(BaseRequest request) {
		
		request.setStimestamp(String.valueOf(new Date().getTime()));
		
		return new LPushCommand((LPushRequest)request);
	}

	
}
