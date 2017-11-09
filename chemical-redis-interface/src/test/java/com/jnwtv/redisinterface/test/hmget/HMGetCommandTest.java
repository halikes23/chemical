package com.jnwtv.redisinterface.test.hmget;

import org.junit.Test;

import com.fq.command.CommandFactory;
import com.fq.command.ICommand;
import com.fq.command.impl.hmget.HMGetRequest;
import com.fq.command.impl.hmget.HMGetResponse;

public class HMGetCommandTest {
	@Test
	public void test() {
		
		HMGetRequest hMGetRequest = HMGetRequest.build("test-hsetcommand", "test-field", "test-field") ;
		ICommand command = CommandFactory.getFactory(hMGetRequest).build(hMGetRequest) ;
		HMGetResponse response = command.execute() ;
		System.out.println(response.getValues());

	}
}
