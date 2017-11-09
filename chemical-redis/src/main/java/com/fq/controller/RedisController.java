package com.fq.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fq.common.constant.RetCode;
import com.fq.redis.Executor;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.CommandContext;
import com.fq.redis.command.ICommand;
import com.fq.util.BeanUtil;
import com.fq.util.IpUtils;

@Controller
public class RedisController {
	
	private final static Logger logger = LoggerFactory.getLogger(RedisController.class);
	
	private final static Set<String> CLIENTS = new HashSet<String>() ;
	
	@Autowired
	private Executor executor ;
	
	@ResponseBody
	@RequestMapping(value = "execute", produces = "application/json;charset=UTF-8")
	public Map<String , Object> execute(HttpServletRequest request , HttpServletResponse response ){
		Map<String, Object> param = BeanUtil.getOrderModel(request);
		
		ICommand<?> command = CommandContext.getCommand(param) ;
		
		if( command == null ){
			logger.error("unsupported command : " + param.get("commandType"));
			return RetCode.buildRetCodeResult(RetCode.REDIS_UNSUPPORT_COMMAND) ;
		}
		BaseResponse<?> rep = executor.execute(command, param) ;
		logger.debug(rep.toString());
		return rep ;
		
	}
	
	@ResponseBody
	@RequestMapping(value = "shakehandle", produces = "application/json;charset=UTF-8")
	public Map<String , Object> shakehandle(HttpServletRequest request , HttpServletResponse response ){
		Map<String, Object> model = BeanUtil.getOrderModel(request);
		
		CLIENTS.add(IpUtils.getIpAddr(request));
		
		return model ;
	}
	
}
