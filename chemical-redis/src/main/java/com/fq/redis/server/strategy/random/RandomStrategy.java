package com.fq.redis.server.strategy.random;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fq.redis.command.ICommand;
import com.fq.redis.server.RedisServer;
import com.fq.redis.server.RedisServerContext;
import com.fq.redis.server.strategy.Strategy;

@Service
public class RandomStrategy implements Strategy<ICommand , RedisServer>{

	@Override
	public RedisServer get(ICommand command,List<RedisServer> servers , RedisServer master) {
		
		if( command.isWrite() == true ){
			return master;
		}else{
			
			Integer index = new Random().nextInt( servers.size() ) ;
			
			return servers.get( index );
			
		}
		
	}

}

