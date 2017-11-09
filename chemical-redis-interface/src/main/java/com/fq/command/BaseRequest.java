package com.fq.command;

import net.sf.json.JSONObject;

public abstract class BaseRequest {

	protected BaseRequest(){
		initCommandType();
	}
	
	protected String commandType ;
	
	public String stimestamp ;
	
	public String clientIp ;
	
	public String getCommandType() {
		return commandType;
	}
	
	public abstract void initCommandType() ;

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getStimestamp() {
		return stimestamp;
	}

	public void setStimestamp(String stimestamp) {
		this.stimestamp = stimestamp;
	}

	public String toJsonString(){
		return JSONObject.fromObject(this).toString();
	}
	
}
