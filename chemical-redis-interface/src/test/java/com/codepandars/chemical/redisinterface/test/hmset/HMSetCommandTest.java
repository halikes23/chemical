package com.codepandars.chemical.redisinterface.test.hmset;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.codepandars.chemical.redisinterface.command.impl.hmset.HMSetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hmset.HMSetResponse;

public class HMSetCommandTest {
	@Test
	public void test() {
		
		HMSetRequest hMSetRequest = HMSetRequest.build("testhmset2", "f1","v2" ,"f2","v3") ;
		ICommand command = CommandFactory.getFactory(hMSetRequest).build(hMSetRequest) ;
		HMSetResponse response = command.execute() ;
		Assert.assertTrue(StringUtils.equals(response.getResult(),"OK"));
	}
	
}
