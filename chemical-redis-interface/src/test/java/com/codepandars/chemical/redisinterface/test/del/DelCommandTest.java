package com.codepandars.chemical.redisinterface.test.del;

import org.junit.Test;

import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.codepandars.chemical.redisinterface.command.impl.del.DelRequest;
import com.codepandars.chemical.redisinterface.command.impl.del.DelResponse;

public class DelCommandTest {
	@Test
	public void testExecute() {
		
		DelRequest delRequest = new DelRequest() ;
		delRequest.setKey("test-field");
		
		ICommand command = CommandFactory.getFactory(delRequest).build(delRequest) ;
		DelResponse response = command.execute() ;
		System.out.println(response);

	}
}
