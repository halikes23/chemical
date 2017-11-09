package com.fq.command.impl.hmset;

import java.util.Date;

import com.fq.command.BaseRequest;
import com.fq.command.CommandFactory;
import com.fq.command.ICommand;

public class HMSetCommandFactory extends CommandFactory{

	@Override
	public ICommand build(BaseRequest request) {
		
		request.setStimestamp(String.valueOf(new Date().getTime()));
		
		return new HMSetCommand((HMSetRequest)request);
	}
	
}
