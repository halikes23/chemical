package com.jnwtv.common.test.util.timerlogger;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fq.util.timerlogger.TimerLogger;
import com.fq.util.timerlogger.TimerLoggerFactory;

public class TimerLoggerTest {

	@Test
	public void Test() throws InterruptedException{
	
		Logger logger = LoggerFactory.getLogger(TestHelpClass.class) ;
		
		TimerLogger timerLogger = TimerLoggerFactory.getLogger(logger) ;
		timerLogger.first();
		Thread.sleep(1000L);
		timerLogger.end("end from first");
		Thread.sleep(1000L);
		timerLogger.first("first");
		Thread.sleep(1000L);
		timerLogger.begin();
		Thread.sleep(1000L);
		timerLogger.end("end from begin");
		Thread.sleep(2000L);
		timerLogger.begin("begin");
		Thread.sleep(2000L);
		timerLogger.endAndNewBegin("endAndNewBegin");
		Thread.sleep(1000L);
		timerLogger.endFromFirst("endFromFirst");
		
		Assert.assertTrue(true);
		
	}
	
}
