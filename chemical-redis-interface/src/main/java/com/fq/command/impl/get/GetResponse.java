package com.fq.command.impl.get;

import com.fq.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

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
