package com.codepandars.chemical.redis.validator;

import java.util.Map;

import com.codepandars.chemical.redis.command.ICommand;

public interface Validator {

	public Map<String,Object> validate(ICommand command) ;
	
}
