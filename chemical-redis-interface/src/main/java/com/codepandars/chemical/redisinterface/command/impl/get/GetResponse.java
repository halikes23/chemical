package com.codepandars.chemical.redisinterface.command.impl.get;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseResponse;

import net.sf.ezmorph.bean.MorphDynaBean;

public class GetResponse extends BaseResponse{

	private String value ;

	public GetResponse(){} 
	
	GetResponse(MorphDynaBean mdb){
		super(mdb);
		this.value = (String)mdb.get(CommonConstant.REDIS.KEY_VALUE) ;
	} 

	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	@Override
	public String toString() {
		return "GetResponse [value=" + value + "]";
	}
	
}
