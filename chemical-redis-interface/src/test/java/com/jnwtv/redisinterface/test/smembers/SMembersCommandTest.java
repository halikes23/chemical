package com.jnwtv.redisinterface.test.smembers;

import java.util.Date;
import java.util.Set;

import org.junit.Test;

import com.fq.command.CommandFactory;
import com.fq.command.ICommand;
import com.fq.command.impl.sadd.SAddCommand;
import com.fq.command.impl.sadd.SAddCommandFactory;
import com.fq.command.impl.sadd.SAddRequest;
import com.fq.command.impl.smembers.SMembersRequest;
import com.fq.command.impl.smembers.SMembersResponse;

public class SMembersCommandTest {
	
	@Test
	public void test() {
		long date = new Date().getTime();
		SAddRequest sAddRequest = SAddRequest.build("testset" + date, "test") ;
		ICommand sAddCommand = SAddCommandFactory.getFactory(sAddRequest).build(sAddRequest) ;
		sAddCommand.execute() ;
		
		SMembersRequest sMembersRequest = SMembersRequest.build("testset" + date ) ;
		ICommand command = CommandFactory.getFactory(sMembersRequest).build(sMembersRequest) ;
		SMembersResponse response = command.execute() ;
		Set<String> members = response.getMembers() ;
		for( String member : members ){
			System.out.println(member);
		}

	}
}
