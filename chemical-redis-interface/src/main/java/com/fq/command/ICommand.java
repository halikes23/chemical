package com.fq.command;

import com.fq.exception.JnwtvException;



public interface ICommand {

	BaseRequest execute = null;

	<RP extends BaseResponse> RP execute( )  throws JnwtvException;
	
}
