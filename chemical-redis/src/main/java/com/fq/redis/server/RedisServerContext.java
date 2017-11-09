package com.fq.redis.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fq.properties.RedisProperties;
import com.fq.redis.command.ICommand;
import com.fq.redis.server.strategy.Strategy;

import redis.clients.jedis.Jedis;

/**
 * REDIS服务管理器
 * @author zhen.cheng
 *
 */
public class RedisServerContext{
	
	private static final Logger logger = LoggerFactory.getLogger(RedisServerContext.class) ;
	/**
	 * 所有服务
	 */
	private Map<String,RedisServer> servers ;
	
	/**
	 * 所有存活的服务
	 */
	private volatile List<RedisServer> aliveServers ;
	
	private Strategy<ICommand,RedisServer> strategy ;
	
	private Map<String,AtomicInteger> errorCount = new HashMap<String,AtomicInteger>();
	
	private volatile Boolean isRefleshing = false ;
	
	private volatile Boolean isMonitoring = false ;
	
	/**
	 * 主服务器
	 */
	private RedisServer master ;
	
	public synchronized void init(){
		Set<String> keys = servers.keySet() ;
		for(String key : keys){
			errorCount.put(key, new AtomicInteger(0)) ;
		}
		errorCount.put("NULL", new AtomicInteger(0)) ;
		reflesh() ;
		new Thread(new Runnable(){

			@Override
			public void run() {
				
				while(true){
					try {
						Thread.sleep(1*60*1000L);
					} catch (InterruptedException e) {
						logger.error("",e);
					}
					reflesh() ;
				}
				
			}
			
		}).start(); 
		
	}
	
	public synchronized void reflesh(){
		isRefleshing = true ;
		try{
			logger.info("Redis context start refleshing ");
			
			this.errorCount = new HashMap<String,AtomicInteger>() ;
			
			List<RedisServer> temp = new ArrayList<RedisServer>() ;
			errorCount.put("NULL", new AtomicInteger(0)) ;
			for(String addr : RedisProperties.REDIS_SERVERS){
				
				errorCount.put(addr, new AtomicInteger(0)) ;
				
				boolean broken = false ;
				
				RedisServer server = servers.get(addr) ;
	
				Jedis jedis = null ;
				
				try{
					jedis = server.getConnection() ;
					if(jedis.isConnected()){
						temp.add(server) ;
						changeMasterAfterTest(jedis,server) ;
					}
				}catch(Exception e){
					logger.error(String.format("Redis【%s】尝试连接失败",addr) , e);
					broken = true ;
				}finally{
					if(jedis != null){
						server.closeConnection(jedis, broken);
					}
				}
				
			}
			aliveServers = temp ;
		}catch(Exception e){
			logger.error("",e);
		}finally{
			this.isRefleshing = false ;
		}
		
		
		
		
		
	}
	
	private void changeMasterAfterTest(Jedis jedis,RedisServer server){
		try{
			jedis.set("testwrite", "1") ;
			synchronized(this){
				master = server ;
			}
			logger.info(String.format("Redis【%s】服务被标记为主机", server.getAddr()));
		}catch(Exception e){
			logger.info(String.format("Redis【%s】服务被标记为备机", server.getAddr()));
		}
	}
	
	private void monitor(){
		
	}
	
	public RedisServer getRedisServer(ICommand command){
		return strategy.get(command,aliveServers,master) ;
	}

	public void setServers(Map<String, RedisServer> servers) {
		this.servers = servers;
	}
	
	public void executeFailedCallbackHandler( String addr ){
		
		if( this.isMonitoring == true || this.isRefleshing == true){
			return ;
		}
		synchronized (this) {
			this.isMonitoring = true ;
			Set<String> keys = errorCount.keySet() ;
			for(String key : keys){
				int count = errorCount.get(key).get() ;
				logger.info(String.format("Redis【%s】访问失败计数 %d",key,count));
				if( count > 4 ){
					this.reflesh(); 
					break ;
				}
			}
			try{
				this.errorCount.get(addr).addAndGet(1);
				this.monitor();
			}catch(Exception e){
				logger.error("",e);
			}finally{
				this.isMonitoring = false ;
			}
		}
	}

	public void setStrategy(Strategy<ICommand,RedisServer> strategy) {
		this.strategy = strategy;
	}

	public Boolean getIsRefleshing() {
		return isRefleshing;
	}
	
}
