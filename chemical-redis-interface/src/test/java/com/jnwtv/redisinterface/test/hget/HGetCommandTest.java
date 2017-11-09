package com.jnwtv.redisinterface.test.hget;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.fq.command.CommandFactory;
import com.fq.command.ICommand;
import com.fq.command.impl.hget.HGetRequest;
import com.fq.command.impl.hget.HGetResponse;

public class HGetCommandTest {
	@Test
	public void testExecute() {
		
		HGetRequest hGetRequest = HGetRequest.build("test-hsetcommand","test-field") ;
		ICommand command = CommandFactory.getFactory(hGetRequest).build(hGetRequest) ;
		HGetResponse response = command.execute() ;
		Assert.assertTrue(StringUtils.equals(response.getValue(),"Thu Jul 20 18:25:06 CST 2017"));

	}
}
