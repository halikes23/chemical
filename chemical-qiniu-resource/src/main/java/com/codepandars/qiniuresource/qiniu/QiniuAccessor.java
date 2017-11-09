package com.codepandars.qiniuresource.qiniu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codepandars.qiniuresource.Accessor;
import com.codepandars.qiniuresource.BaseAccessor;
import com.codepandars.qiniuresource.common.RetCode;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;

public class QiniuAccessor extends BaseAccessor implements Accessor{

	private final static Logger logger = LoggerFactory.getLogger(QiniuAccessor.class) ;
	
	@Override
	public String getToken() {
		return getCdn().getQiniuBucket().getToken();
	}

	@Override
	public String getUploadToken() {
		return getCdn().getQiniuBucket().getUploadToken() ;
	}

	@Override
	public String upload(String fullFileName,String key){
		try {
			// 调用put方法上传
			Response res = this.getCdn().getQiniuBucket().getUploadManager().put(fullFileName, key, getUploadToken());
			if( res.statusCode != 200 ){
				logger.error("七牛上传资源失败",res.bodyString());
				return RetCode.QINIU_SERVER_ERROR ;
			}
			// 打印返回的信息
			return RetCode.SUCCESS ;
			
		} catch (QiniuException e) {
			if(e.response.statusCode == 614){
				return RetCode.SUCCESS ;
			}
			logger.error("",e);
			return RetCode.QINIU_SERVER_ERROR ;
		}
	}

	@Override
	public void fetch(String url, String fileName) {
		try{
			BucketManager bucketManager = this.getCdn().getQiniuBucket().getBucketManager() ;
			bucketManager.fetch(url, this.getCdn().getQiniuBucket().getBucketName(), fileName);
		}catch(Exception e){
			logger.error("",e);
			throw new RuntimeException(e) ;
		}
	}

	@Override
	public String toString() {
		return "QiniuAccessor [cdn=" + cdn + "]";
	}

}
