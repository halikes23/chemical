package com.codepanders.qiniuresource;

import com.codepanders.qiniuresource.qiniu.QiniuBucket;

public class Cdn {

	private String domainName ;

	private String protocol ;
	
	private QiniuBucket qiniuBucket ;

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public QiniuBucket getQiniuBucket() {
		return qiniuBucket;
	}

	public void setQiniuBucket(QiniuBucket qiniuBucket) {
		this.qiniuBucket = qiniuBucket;
	}
	
}
