package com.codepandars.chemical.redisinterface.test.hget;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.codepandars.chemical.redisinterface.command.impl.hget.HGetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hget.HGetResponse;

public class HGetCommandTest {
	@Test
	public void testExecute() {
		
		HGetRequest hGetRequest = HGetRequest.build("test-hsetcommand","test-field") ;
		ICommand command = CommandFactory.getFactory(hGetRequest).build(hGetRequest) ;
		HGetResponse response = command.execute() ;
		Assert.assertTrue(StringUtils.equals(response.getValue(),"Thu Jul 20 18:25:06 CST 2017"));

	}
}
