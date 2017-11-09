package com.codepandars.chemical.redis.server.strategy.random;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codepandars.chemical.redis.command.ICommand;
import com.codepandars.chemical.redis.server.RedisServer;
import com.codepandars.chemical.redis.server.RedisServerContext;
import com.codepandars.chemical.redis.server.strategy.Strategy;

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

