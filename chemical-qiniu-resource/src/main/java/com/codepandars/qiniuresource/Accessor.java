package com.codepandars.qiniuresource;

import java.util.Map;

public interface Accessor {

	public String getUrl(String resourceName);
	public String getUrl(String resourceName, Map<String, String> params);
	public String getUrl(String resourceName, String params) ;
	public String getToken();
	public String getUploadToken() ;
	public String upload(String fullFileName,String key);
	public void fetch(String url , String fileName) ;
}
