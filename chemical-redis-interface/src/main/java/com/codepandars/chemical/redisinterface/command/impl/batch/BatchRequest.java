package com.codepandars.chemical.redisinterface.command.impl.batch;

import java.util.ArrayList;
import java.util.List;

import com.codepandars.chemical.redisinterface.command.BaseRequest;
import com.codepandars.chemical.redisinterface.command.ICommand;

public class BatchRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "batch" ;
	}
	
	private BaseRequest[] requests ;
	
	public void setRequests(BaseRequest ... requests){
		this.requests = requests ;
	}

	public BaseRequest[] getRequests() {
		return requests;
	}

	
	
	
}
