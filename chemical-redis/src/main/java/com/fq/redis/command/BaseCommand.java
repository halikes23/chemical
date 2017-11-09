package com.fq.redis.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseCommand {

	protected boolean isWrite = true ;
	
	protected final static Logger logger = LoggerFactory.getLogger(BaseCommand.class) ;
	
	public boolean isWrite() {
		return true;
	}
	
}
