package com.codepandars.chemical.redisinterface.command.impl.ltrim;

import com.codepandars.chemical.redisinterface.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

import net.sf.ezmorph.bean.MorphDynaBean;

public class LTrimResponse extends BaseResponse{

	private String result ;

	public LTrimResponse(){} 
	
	LTrimResponse(MorphDynaBean mdb){
		super(mdb);
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
		return "LTrimResponse [result=" + result + "]";
	}

}
