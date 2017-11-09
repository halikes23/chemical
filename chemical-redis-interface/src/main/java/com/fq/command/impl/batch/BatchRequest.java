package com.fq.command.impl.batch;

import java.util.ArrayList;
import java.util.List;

import com.fq.command.BaseRequest;
import com.fq.command.ICommand;

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
