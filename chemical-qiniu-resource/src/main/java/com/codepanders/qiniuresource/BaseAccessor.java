package com.codepanders.qiniuresource;

import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class BaseAccessor{

	protected Cdn cdn ;
	
	private final static String SYMBOL_SLASH = "/" ;
	
	private final static String SYMBOL_COLON = ":" ;
	
	private final static String SYMBOL_DOUBLE_SLASH = "//" ;
	
	private final static String SYMBOL_EQUAL = "=" ;
	
	public String getUrl(String resourceName) {
		return getUrl(resourceName,StringUtils.EMPTY);
	}

	public String getUrl(String resourceName, Map<String, String> params) {
		StringBuilder p = new StringBuilder() ;
		
		Set<String> keys = params.keySet() ;
		int i = 0 ;
		for( String key : keys ){
			String value = params.get(key) ;
			if( i == 0 ){
				p.append("?") ;
				i ++ ;
			}else{
				p.append("&") ;
			}
			p.append(key).append(SYMBOL_EQUAL).append(value) ;
			
		}
		
		return getUrl(resourceName,p.toString());
	}
	
	public String getUrl(String resourceName, String params) {
		
		return cdn.getQiniuBucket().getAuth().privateDownloadUrlWithDeadline(new StringBuilder()
		.append(cdn.getProtocol())
		.append(SYMBOL_COLON)
		.append(SYMBOL_DOUBLE_SLASH)
		.append(cdn.getDomainName())
		.append(SYMBOL_SLASH)
		.append(resourceName)
		.append(params)
		.toString()  , 2997426444l); 
		
	}
	
	public Cdn getCdn() {
		return cdn;
	}

	public void setCdn(Cdn cdn) {
		this.cdn = cdn;
	}

}
