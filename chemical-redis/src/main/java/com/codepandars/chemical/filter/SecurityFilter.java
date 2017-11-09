package com.codepandars.chemical.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codepandars.chemical.common.constant.RetCode;
import com.codepandars.chemical.properties.RedisProperties;
import com.codepandars.chemical.util.IpUtils;

/**
 * redis服务访问权限控制过滤器
 * @author zhen.cheng
 *
 */
public class SecurityFilter implements Filter {

	private final static Logger logger = LoggerFactory.getLogger(SecurityFilter.class) ;

	private final static String IP_ALL = "***.***.***.***" ;
	
	private final static String ERR_STRING_1 = " ip:";
	private final static String ERR_STRING_2 = " ; redisAccessKey : ";
	private final static String ERR_STRING_3 = " ; redisSecretKey : ";
	
	/**
	 * 初始化过滤器参数信息
	 */
	public void init(FilterConfig cfg) throws ServletException {
		// do nothing
	}
	
	/**
	 * 执行过滤器
	 */
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		
		String ip = IpUtils.getIpAddr(request) ;
		String redisAccessKey = request.getParameter("redisAccessKey");
		String redisSecretKey = request.getParameter("redisSecretKey");
		
		if( ( RedisProperties.REDIS_ACCESS_IP_WHITE_LIST.contains(ip) || RedisProperties.REDIS_ACCESS_IP_WHITE_LIST.contains(IP_ALL) ) &&
				StringUtils.equals(RedisProperties.REDIS_ACCESS_KEY, redisAccessKey) &&
				StringUtils.equals(RedisProperties.REDIS_SECRET_KEY, redisSecretKey)
		){
			chain.doFilter(req, res) ;
		}else{
			StringBuilder err = new StringBuilder() ;
			err.append(RetCode.RET_CODE_MSG(RetCode.REDIS_LIMIT_ACCESS_PREMISSION))
				.append(ERR_STRING_1).append(ip)
				.append(ERR_STRING_2).append(redisAccessKey)
				.append(ERR_STRING_3).append(redisSecretKey) ;
			
			logger.error(err.toString());
		}
		
		
	}
	
	public void destroy() {
		// do nothing
	}
}
