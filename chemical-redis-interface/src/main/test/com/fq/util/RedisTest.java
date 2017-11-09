package com.fq.util;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fq.command.CommandFactory;
import com.fq.command.impl.incr.IncrCommand;
import com.fq.command.impl.incr.IncrRequest;
import com.fq.command.impl.incr.IncrResponse;

public class RedisTest {

	@Before
	public void setup() {
	}

	@Test
	public void test() {
		
		IncrRequest incrRequest = new IncrRequest() ;
		incrRequest.setKey("b123");
		incrRequest.setStimestamp(String.valueOf(new Date().getTime()));
		incrRequest.setClientIp("localhost");
		IncrCommand incrCommand = CommandFactory.getFactory(incrRequest).build(incrRequest) ;
		IncrResponse incrResponse = incrCommand.execute() ;
		System.out.println(incrResponse);
//
//		LLenRequest lLenRequest = new LLenRequest() ;
//		lLenRequest.setKey("list");
//		lLenRequest.setStimestamp(String.valueOf(new Date().getTime()));
//		lLenRequest.setClientIp("127.0.0.1");
//		LLenCommand command = CommandFactory.getFactory(lLenRequest).build(lLenRequest);
//		LLenResponse lLenResponse = command.execute() ;
//		System.out.println(lLenResponse);
//		
//		RPopRequest rPopRequest = new RPopRequest() ;
//		rPopRequest.setKey("list");
//		rPopRequest.setStimestamp(String.valueOf(new Date().getTime()));
//		rPopRequest.setClientIp("127.0.0.1");
//		RPopCommand rPopCommand = CommandFactory.getFactory(rPopRequest).build(rPopRequest) ;
//		RPopResponse rPopResponse = rPopCommand.execute() ;
//		System.out.println(rPopResponse);
//		
//		LRangeRequest lRangeRequest = new LRangeRequest() ;
//		lRangeRequest.setStimestamp(String.valueOf(new Date().getTime()));
//		lRangeRequest.setClientIp("127.0.0.1");
//		lRangeRequest.setKey("list");
//		lRangeRequest.setStart("0");
//		lRangeRequest.setStop("-1");
//		LRangeCommand lRangeRCommand = CommandFactory.getFactory(lRangeRequest).build(lRangeRequest);
//		LRangeResponse lRangeResponse = lRangeRCommand.execute() ;
//		System.out.println(lRangeResponse);
//		
//		LPushRequest lpushRequest = new LPushRequest() ;
//		lpushRequest.setStimestamp(String.valueOf(new Date().getTime()));
//		lpushRequest.setClientIp("127.0.0.1");
//		lpushRequest.setKey("list");
//		lpushRequest.setValues(new String[]{"test1","test2","test3"});
//		ICommand lPushCommand = CommandFactory.getFactory(lpushRequest).build(lpushRequest);
//		LPushResponse lpushResponse = lPushCommand.execute();
//		System.out.println(lpushResponse);
		
//		GetRequest getRequest = new GetRequest() ;
//		getRequest.setKey("1");
//		getRequest.setStimestamp(String.valueOf(new Date().getTime()));
//		getRequest.setClientIp("127.0.0.1");
//		GetCommand getCommand = CommandFactory.getFactory(getRequest).build(getRequest) ;
//		GetResponse getResponse = getCommand.execute() ;
//		System.out.println(getResponse);
//		
//		SetRequest setRequest = new SetRequest() ;
//		setRequest.setKey("2");
//		setRequest.setValue("3");
//		setRequest.setStimestamp(String.valueOf(new Date().getTime()));
//		setRequest.setClientIp("127.0.0.1");
//		SetCommand setCommand = CommandFactory.getFactory(setRequest).build(setRequest) ;
//		SetResponse setResponse = setCommand.execute() ;
//		System.out.println(setResponse);
//		
//		GetRequest getRequest = new GetRequest() ;
//		getRequest.setKey("2");
//		getRequest.setStimestamp(String.valueOf(new Date().getTime()));
//		getRequest.setClientIp("127.0.0.1");
//		GetCommand getCommand = CommandFactory.getFactory(getRequest).build(getRequest) ;
//		GetResponse getResponse = getCommand.execute() ;
//		System.out.println(getResponse);
		
//		SAddRequest saddRequest = new SAddRequest();
//		saddRequest.setKey("tests");
//		saddRequest.setMembers("value1","value5","value7");
//		saddRequest.setClientIp("127.0.0.1");
//		SAddCommand saddCommand = CommandFactory.getFactory(saddRequest).build(saddRequest) ;
//		SAddResponse saddResponse = saddCommand.execute() ;
//		System.out.println(saddResponse);
	}
}