package com.jnwtv.redisinterface.test.del;

import org.junit.Test;

import com.fq.command.CommandFactory;
import com.fq.command.ICommand;
import com.fq.command.impl.del.DelRequest;
import com.fq.command.impl.del.DelResponse;

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
