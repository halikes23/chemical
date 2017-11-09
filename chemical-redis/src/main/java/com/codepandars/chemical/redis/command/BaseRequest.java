package com.codepandars.chemical.redis.command;

public abstract class BaseRequest {

	public String commandType ;
	
	public String timestamp ;
	
	public ResponseFactory responseBuildStrategy ;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCommandType() {
		return commandType;
	}

	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}
	
	
	protected ResponseFactory getResponseBuildStrategy(){
		return null ;
	}
	
}
