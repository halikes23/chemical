package com.codepandars.qiniuresource.qiniu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codepandars.qiniuresource.Auth;
import com.codepandars.qiniuresource.QiniuSource;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;

public class QiniuBucket {

	private final static Logger logger = LoggerFactory.getLogger(QiniuBucket.class) ;
	
	private QiniuSource qiniuSource ;
	
	private String bucketName ;
	
	private Auth auth ;
	
	private UploadManager uploadManager = new UploadManager();
	private BucketManager bucketManager ;
	
	public void init(){
		auth = Auth.create( qiniuSource.getAccessKey() , qiniuSource.getSecretKey() );
		bucketManager = new BucketManager(auth.getOriAuth()) ;
	}
	
	public String getToken(){
		return auth.uploadToken( bucketName ) ; 
	}

	public void setQiniuSource(QiniuSource qiniuSource) {
		this.qiniuSource = qiniuSource;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}
	
	public String getUploadToken() {
		return auth.uploadToken(bucketName) ;
	}

	public UploadManager getUploadManager() {
		return uploadManager;
	}

	public BucketManager getBucketManager() {
		return bucketManager;
	}

	public String getBucketName() {
		return bucketName;
	}
	
	
	
}
