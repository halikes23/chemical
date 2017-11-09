package com.fq.command;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fq.common.constant.RetCode;
import com.fq.common.util.HttpHelper;
import com.fq.exception.JnwtvException;
import com.fq.properties.RedisInterfaceProperties;
import com.fq.redisserver.RedisServerManager;

/**
 * 基础命令类 
 * 1、实现基本queryString生成
 * 2、实现redis命令调用 
 * @author zhen.cheng
 *
 * @param <RQ> 请求
 * @param <RP> 返回
 */
public abstract class BaseCommand<RQ extends BaseRequest,RP extends BaseResponse> implements ICommand {

	protected BaseCommand(){
		RedisServerManager redisServerManager = new RedisServerManager() ;
	}
	
	protected boolean isWrite ;
	
	protected final static Logger logger = LoggerFactory.getLogger(BaseCommand.class) ;
	
	protected RQ request ;
	
	protected abstract RP buildResponse(String response);
	
	protected abstract Map<String,String> buildParameters();
	
	protected final String buildQueryString() {
		
		StringBuilder query = BaseCommand.builderBaseQueryString(request);
		
		query.append("&commandType=").append(request.getCommandType()) ;
		
		return query.toString();
	}
	
	public BaseCommand(RQ request){
		this.request = request ;
	}
	
	/**
	 * 执行
	 * @return
	 * @throws RuntimeException
	 */
	@Override
	final public RP execute() throws JnwtvException{
		
		String url = RedisServerManager.getServer().getAccessBaseUrl() + buildQueryString() ;
		
		try{
			
			String responseString = HttpHelper.doPost( url , buildParameters()) ;
			
			return buildResponse(responseString) ;
			
		}catch(Exception e){
			logger.error("请求Redis服务失败，url:" + url , e );
			throw new JnwtvException( RetCode.REDIS_ACCESS_ALL_SERVER_ERR , e ) ;
		}
	}
	
//	private RP executeException(){
//		try {
//			Thread.sleep(1000L);
//		} catch (InterruptedException e) {
//			logger.error("",e);
//		}
//		RedisServer master = RedisServerManager.getMaster() ;
//		synchronized (errAccessCount) {
//			errAccessCount ++ ;
//			// 如果返回REDIS服务为只读的，测尝试连接其他REDIS服务
//			String old = master.getAddr() ;
//			
//			RedisServerManager.newMaster() ;
//			
//			logger.info("redis【"+ old +"】发生异常，切换redis服务【" + RedisServerManager.getMaster().getAddr() + "】");
//			
//		}
//			
//		return execute();
//	}

	/**
	 * 生成基础查询字符串
	 * @param request
	 * @return
	 */
	protected final static StringBuilder builderBaseQueryString(BaseRequest request){
		
		final StringBuilder queryString = new StringBuilder();
		queryString
			.append("?stimestamp=").append(request.getStimestamp())
			.append("&clientIp=").append(request.getClientIp())
			.append("&redisAccessKey=").append(RedisInterfaceProperties.REDIS_ACCESS_KEY)
			.append("&redisSecretKey=").append(RedisInterfaceProperties.REDIS_SECRET_KEY);
		return queryString ;
		
	}

	public boolean isWrite() {
		return isWrite;
	}

	public void setWrite(boolean isWrite) {
		this.isWrite = isWrite;
	}
	
	
	
}
