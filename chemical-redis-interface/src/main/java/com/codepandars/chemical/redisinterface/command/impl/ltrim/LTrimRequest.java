package com.codepandars.chemical.redisinterface.command.impl.ltrim;

import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class LTrimRequest extends BaseRequest{

	private LTrimRequest(String key ,String start , String stop){
		this.key = key ;
		this.start = start ;
		this.stop = stop ;
	}
	
	public static LTrimRequest build(String key ,String start , String stop){
		return new LTrimRequest(key,start,stop) ;
	}
	
	public void initCommandType(){
		this.commandType = "ltrim" ;
	}
	
	private String key ;
	
	private String start ;
	
	private String stop ;

	public String getKey() {
		return key;
	}

	public String getStart() {
		return start;
	}

	public String getStop() {
		return stop;
	}

}
