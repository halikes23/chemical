package com.fq.command.impl.hmget;

import java.util.List;

import com.fq.command.BaseResponse;
import com.fq.common.constant.CommonConstant;

import net.sf.ezmorph.bean.MorphDynaBean;

public class HMGetResponse extends BaseResponse{

	private List<String> values ;
	
	public HMGetResponse(){} ;
	
	HMGetResponse(MorphDynaBean mdb){
		super(mdb) ;
		this.values = (List<String>)mdb.get(CommonConstant.REDIS.KEY_VALUES) ;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "HMGetResponse [" + (values != null ? "values=" + values : "") + "]";
	}

}
