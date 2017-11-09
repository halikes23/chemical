package com.codepandars.chemical.common.util.timferlogger;

import java.util.Date;

import org.slf4j.Logger;

public class TimerLogger {

	private Logger logger ;
	
	private Long first ;
	
	private Long begin ;
	
	private Long end ;
	
	private final static String END_MSG_TEMPLATE = "{} 执行结束,耗时:{}毫秒 {}秒" ;
	
	private final static String BEGIN_MSG_TEMPLATE = "{} 执行开始" ;
	
	private String lastMsg = "";
	
	private TimerLogger(Logger logger){
		first = new Date().getTime() ;
		begin = new Date().getTime() ;
		this.logger = logger ;
	}
	
	static TimerLogger build(Logger logger){
		return new TimerLogger(logger);
	}
	
	public void begin(){
		this.begin = new Date().getTime() ;
	}
	
	public void begin(String msg){
		this.begin = new Date().getTime() ;
		printBegintMsg(msg);
	}
	
	public void endAndNewBegin(String msg){
		end(lastMsg) ;
		begin(msg);
	}
	
	public void end(String msg){
		end = new Date().getTime();
		Long cost = end - begin ;
		printEndMsg(msg,cost) ;
	}
	
	public void endFromFirst(String msg){
		end = new Date().getTime();
		Long cost = end - first ;
		printEndMsg(msg,cost) ;
	}
	
	public void first(){
		this.first = new Date().getTime() ;
	}
	
	public void first(String msg){
		first() ;
		printBegintMsg(msg);
	}
	
	private void printBegintMsg(String msg){
		logger.info( BEGIN_MSG_TEMPLATE , msg );
		lastMsg = msg ;
	}
	
	private void printEndMsg(String msg,Long cost){
		logger.info( END_MSG_TEMPLATE , new Object[]{msg,cost,cost/1000} );
		lastMsg = msg ;
	}
	
}
