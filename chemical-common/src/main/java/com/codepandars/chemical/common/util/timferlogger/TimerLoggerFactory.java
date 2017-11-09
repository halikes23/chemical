package com.codepandars.chemical.common.util.timferlogger;

import org.slf4j.Logger;

public class TimerLoggerFactory {

	public final static TimerLogger getLogger( Logger logger ){
		
		return TimerLogger.build(logger) ;
		
	}
	
}
