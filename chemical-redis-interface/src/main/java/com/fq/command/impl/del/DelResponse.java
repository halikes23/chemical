package com.fq.command.impl.del;

import com.fq.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

import net.sf.ezmorph.bean.MorphDynaBean;

public class DelResponse extends BaseResponse{

	private Long result ;

	public DelResponse(){} ;
	
	public DelResponse(MorphDynaBean mdb){
		super(mdb);
		this.result = Long.valueOf(String.valueOf(mdb.get(CommonConstant.REDIS.KEY_RESULT))) ;
	} ;
	
	public Long getResult() {
		return result;
	}

	public void setResult(Long result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "DelResponse [result=" + result + "]";
	}

}
