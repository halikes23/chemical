package com.codepandars.chemical.redisinterface.test.hmget;

import org.junit.Test;

import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.codepandars.chemical.redisinterface.command.impl.hmget.HMGetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hmget.HMGetResponse;

public class HMGetCommandTest {
	@Test
	public void test() {
		
		HMGetRequest hMGetRequest = HMGetRequest.build("test-hsetcommand", "test-field", "test-field") ;
		ICommand command = CommandFactory.getFactory(hMGetRequest).build(hMGetRequest) ;
		HMGetResponse response = command.execute() ;
		System.out.println(response.getValues());

	}
}
