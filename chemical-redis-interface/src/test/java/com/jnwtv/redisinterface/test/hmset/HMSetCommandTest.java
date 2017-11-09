package com.jnwtv.redisinterface.test.hmset;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import com.fq.command.CommandFactory;
import com.fq.command.ICommand;
import com.fq.command.impl.hmset.HMSetRequest;
import com.fq.command.impl.hmset.HMSetResponse;

public class HMSetCommandTest {
	@Test
	public void test() {
		
		HMSetRequest hMSetRequest = HMSetRequest.build("testhmset2", "f1","v2" ,"f2","v3") ;
		ICommand command = CommandFactory.getFactory(hMSetRequest).build(hMSetRequest) ;
		HMSetResponse response = command.execute() ;
		Assert.assertTrue(StringUtils.equals(response.getResult(),"OK"));
	}
	
}
