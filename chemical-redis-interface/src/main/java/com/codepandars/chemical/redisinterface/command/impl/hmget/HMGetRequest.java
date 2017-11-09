package com.codepandars.chemical.redisinterface.command.impl.hmget;

import org.apache.commons.lang.StringUtils;

import com.codepandars.chemical.common.constant.BaseConstant;
import com.codepandars.chemical.redisinterface.command.BaseRequest;

public class HMGetRequest extends BaseRequest{

	private HMGetRequest(String key , String fields){
		this.key = key ;
		this.fields = fields ;
	}
	
	public static HMGetRequest build(String key , String ... arrFields){
		String fields = StringUtils.join(arrFields, BaseConstant.REDIS_COMMAND_SPLIT_SYMBOL) ; 
		return new HMGetRequest(key, fields) ;
	}
	
	public void initCommandType(){
		this.commandType = "hmget" ;
	}
	
	private String key ;
	
	private String fields ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

}
