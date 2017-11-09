package com.fq.command.impl.hmset;

import java.util.Map;

import com.fq.command.BaseRequest;

public class HMSetRequest extends BaseRequest{

	private HMSetRequest(String key , String[] fieldsAndValues){
		this.key = key ;
		this.fieldsAndValues = fieldsAndValues ;
		
	}
	
	public static HMSetRequest build(String key , String ... fieldsAndValues){
		return new HMSetRequest(key,fieldsAndValues) ;
	}
	
	public void initCommandType(){
		this.commandType = "hmset" ;
	}
	
	private String key ;
	
	private String[] fieldsAndValues ;

	public String getKey() {
		return key;
	}


	public String[] getFieldsAndValues() {
		return fieldsAndValues;
	}

}
