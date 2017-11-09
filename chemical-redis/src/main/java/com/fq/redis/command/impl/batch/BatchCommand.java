package com.fq.redis.command.impl.batch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fq.redis.command.BaseCommand;
import com.fq.redis.command.BaseResponse;
import com.fq.redis.command.CommandContext;
import com.fq.redis.command.ICommand;
import com.fq.redis.command.ResponseFactoryContext;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@Service
public class BatchCommand extends BaseCommand implements ICommand<List<BaseResponse<?>>>{

	protected boolean isWrite = true ;
	
	@Override
	public BaseResponse<?> execute(Jedis jedis ,Map<String,Object> req) {
		
		List<Map<String,Object>> requests = new ArrayList<Map<String,Object>>() ;
		
		List<ICommand<?>> commands = new ArrayList<ICommand<?>>() ;
		
		List<BaseResponse<?>> responses = new ArrayList<BaseResponse<?>>() ;
		
		String strRequests = (String)req.get("requests")  ;
		
		JSONArray jsonRequests = JSONArray.fromObject(strRequests) ;
		
		Transaction t = jedis.multi() ;
		
		for(int i = 0 ; i < jsonRequests.size() ; i ++){
			
			JSONObject jsonRequest = jsonRequests.getJSONObject(i) ;
			
			Map<String,Object> request = (Map<String,Object>)JSONObject.toBean(jsonRequest,HashMap.class);
			
			requests.add(request) ;
			
			ICommand<?> command = CommandContext.getCommand(request) ;
			
			commands.add(command) ;
			
			command.execute(t, request) ;
			
		}
		
		List<Object> results =  t.exec() ;
		
		for(int i = 0 ; i < results.size() ; i ++ ){
			
			BaseResponse<?> response = ResponseFactoryContext.get(commands.get(i).getClass()).build(requests.get(i), results.get(i)) ;
			responses.add(response) ;
		}
		
		BatchResponse rep = (BatchResponse)ResponseFactoryContext.get(BatchCommand.class).build(req, responses) ;
		
		return rep;
	}

	@Override
	public void execute(Transaction t, Map<String, Object> req) {
		
		// do nothing
		
	}
	
	@Override
	public boolean isWrite() {
		return false;
	}

	public void setWrite(boolean isWrite) {
		this.isWrite = isWrite;
	}

}
