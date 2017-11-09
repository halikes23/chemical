package com.codepandars.chemical.redisinterface.test.get;

import org.junit.Test;

import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.codepandars.chemical.redisinterface.command.impl.get.GetRequest;
import com.codepandars.chemical.redisinterface.command.impl.get.GetResponse;
import com.codepandars.chemical.redisinterface.command.impl.set.SetRequest;
import com.codepandars.chemical.redisinterface.command.impl.set.SetResponse;

public class GetCommandTest {
	
	@Test
	public void test() {
		
		SetRequest setRequest = SetRequest.build("testsetnull" , "1",1) ;
		ICommand command = CommandFactory.getFactory(setRequest).build(setRequest) ;
		SetResponse response = command.execute() ;
		System.out.println(response.getResult());
		
		try {
			Thread.sleep(800L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GetRequest getRequest = GetRequest.build("testsetnull") ;
		command = CommandFactory.getFactory(getRequest).build(getRequest) ;
		GetResponse getResponse = command.execute() ;

		System.out.println("result:" + getResponse.getValue());
		
	//	Assert.assertTrue(StringUtils.equals(response.getValue(),CommonConstant.REDIS.KEY_OK));
		
	}
}
