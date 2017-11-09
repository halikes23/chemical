package com.codepandars.chemical.redisinterface.command;

import com.fq.common.constant.CommonConstant;
import com.fq.common.constant.RetCode;

import net.sf.ezmorph.bean.MorphDynaBean;
import net.sf.json.JSONObject;

public class BaseResponse {

	protected ResponseRetCode retCode ;
	
	protected String commandType ;
	
	protected String stimestamp ;
	
	protected String clientIp ;
	
	public BaseResponse(){ }
	
	protected BaseResponse(MorphDynaBean mdb){
		this.commandType = (String)mdb.get(CommonConstant.REDIS.KEY_COMMAND_TYPE) ;
		this.stimestamp = (String)mdb.get(CommonConstant.REDIS.KEY_STIMESTAMP) ;
		this.clientIp = (String)mdb.get(CommonConstant.REDIS.KEY_CLIENT_IP) ;
	}
	
	
	
	public String getCommandType() {
		return commandType;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getStimestamp() {
		return stimestamp;
	}

	public void setStimestamp(String stimestamp) {
		this.stimestamp = stimestamp;
	}

	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}

	public ResponseRetCode getRetCode() {
		return retCode;
	}

	public void setRetCode(ResponseRetCode retCode) {
		this.retCode = retCode;
	}
	
	protected String toJsonString() {
		return JSONObject.fromObject(this).toString() ;
	}
	
	public static BaseResponse busiErrResponse(String code){
		BaseResponse response = new BaseResponse() ;
		
		ResponseRetCode retCode = new ResponseRetCode() ;
		retCode.setCode(code);
		retCode.setCodeMsg(RetCode.RET_CODE_MSG(code));
		
		response.setRetCode(retCode) ;
		
		return response ;
	}

}
