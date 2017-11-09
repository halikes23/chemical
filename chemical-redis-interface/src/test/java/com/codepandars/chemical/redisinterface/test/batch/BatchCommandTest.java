package com.codepandars.chemical.redisinterface.test.batch;

import org.junit.Test;

import com.codepandars.chemical.redisinterface.command.CommandFactory;
import com.codepandars.chemical.redisinterface.command.ICommand;
import com.codepandars.chemical.redisinterface.command.impl.batch.BatchRequest;
import com.codepandars.chemical.redisinterface.command.impl.batch.BatchResponse;
import com.codepandars.chemical.redisinterface.command.impl.batch.BatchResponseBuilder;
import com.codepandars.chemical.redisinterface.command.impl.del.DelRequest;
import com.codepandars.chemical.redisinterface.command.impl.del.DelResponse;
import com.codepandars.chemical.redisinterface.command.impl.del.DelResponseMDBBuilder;
import com.codepandars.chemical.redisinterface.command.impl.get.GetRequest;
import com.codepandars.chemical.redisinterface.command.impl.get.GetResponse;
import com.codepandars.chemical.redisinterface.command.impl.get.GetResponseMDBBuilder;
import com.codepandars.chemical.redisinterface.command.impl.hmget.HMGetRequest;
import com.codepandars.chemical.redisinterface.command.impl.hmget.HMGetResponse;
import com.codepandars.chemical.redisinterface.command.impl.hmget.HMGetResponseMDBBuilder;
import com.codepandars.chemical.redisinterface.command.impl.set.SetRequest;
import com.codepandars.chemical.redisinterface.command.impl.set.SetResponseMDBBuilder;

public class BatchCommandTest {
	@Test
	public void testExecute() {
		
//		HGetRequest hGetRequest = new HGetRequest() ;
//		hGetRequest.setKey("test-hsetcommand");
//		hGetRequest.setField("test-field");
		
		HMGetResponseMDBBuilder builder = new HMGetResponseMDBBuilder() ;
		builder.register(); 
		
		GetResponseMDBBuilder getBuilder = new GetResponseMDBBuilder() ;
		getBuilder.register(); 
		
		SetResponseMDBBuilder setBuilder = new SetResponseMDBBuilder() ;
		setBuilder.register(); 
		
		DelResponseMDBBuilder delBuilder = new DelResponseMDBBuilder() ;
		delBuilder.register(); 
		
		BatchResponseBuilder batchBuilder = new BatchResponseBuilder() ;
		batchBuilder.register();
		
		new GetResponseMDBBuilder().register() ;
		
		HMGetRequest hMGetRequest1 = HMGetRequest.build("LCCPI:10807", "lcpId", "pageNo" , "cartoonUrl") ;
		
		HMGetRequest hMGetRequest2 = HMGetRequest.build("LCCPI:11108", "lcpId", "pageNo" , "cartoonUrl") ;
		
		GetRequest getRequest = GetRequest.build("testset") ;
		
		SetRequest setRequest = SetRequest.build("testset", "testset-value");
		
		DelRequest delRequest = DelRequest.build("testset") ;
		
		BatchRequest batchReqeust = new BatchRequest() ;
		
		batchReqeust.setRequests(hMGetRequest1, hMGetRequest2 , getRequest , setRequest , getRequest , delRequest);
		
		ICommand batchCommand = CommandFactory.getFactory(batchReqeust).build(batchReqeust) ;
		
 		BatchResponse batchResponse = batchCommand.execute() ;

		System.out.println(batchResponse);
		
		HMGetResponse br0 = (HMGetResponse)batchResponse.getResponses().get(0) ;
		HMGetResponse br1 = (HMGetResponse)batchResponse.getResponses().get(1) ;
		GetResponse br2 = (GetResponse)batchResponse.getResponses().get(2) ;
		GetResponse br4 = (GetResponse)batchResponse.getResponses().get(4);
		DelResponse br5 = (DelResponse)batchResponse.getResponses().get(5);
		
		System.out.println(br0);
		System.out.println(br1);
		System.out.println(br2);
		System.out.println(br4);
		System.out.println(br5);
	}
}
