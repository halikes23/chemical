package com.fq.command.impl.lrange;

import com.fq.command.BaseRequest;

public class LRangeRequest extends BaseRequest{

	public void initCommandType(){
		this.commandType = "lrange" ;
	}
	
	private LRangeRequest(String key , String start , String stop){
		this.key = key ;
		this.start = start ;
		this.stop = stop ;
	}
	
	public static LRangeRequest build(String key , String start , String stop){
		return new LRangeRequest(key,start,stop);
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
