package com.fq.redis.validator;

import java.util.Map;

import com.fq.redis.command.ICommand;

public interface Validator {

	public Map<String,Object> validate(ICommand command) ;
	
}
