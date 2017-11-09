package com.fq.command.impl.hincrby;

import java.util.Date;

import com.fq.command.BaseRequest;
import com.fq.command.CommandFactory;
import com.fq.command.ICommand;

public class HIncrByCommandFactory extends CommandFactory{

	@Override
	public ICommand build(BaseRequest request) {
		
		request.setStimestamp(String.valueOf(new Date().getTime()));
		
		return new HIncrByCommand((HIncrByRequest)request);
	}
	
}
