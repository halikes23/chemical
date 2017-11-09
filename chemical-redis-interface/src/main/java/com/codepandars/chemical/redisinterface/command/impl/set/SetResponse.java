package com.codepandars.chemical.redisinterface.command.impl.set;

import com.codepandars.chemical.common.constant.CommonConstant;
import com.codepandars.chemical.redisinterface.command.BaseResponse;

import net.sf.ezmorph.bean.MorphDynaBean;

public class SetResponse extends BaseResponse{

	private String result ;
	
	public SetResponse(){
		
	}

	SetResponse(MorphDynaBean mdb){
		super(mdb) ;
		this.result = (String)mdb.get(CommonConstant.REDIS.KEY_RESULT) ;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "SetResponse [result=" + result + "]";
	}
	
}
