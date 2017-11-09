package com.fq.entity.po;

public class CpUserInfoPO {
	private Integer cpId ;
	private String  cpName ;
	private String  cpSecret ;
	private String  isDeleted ;
	public Integer getCpId() {
		return cpId;
	}
	public void setCpId(Integer cpId) {
		this.cpId = cpId;
	}
	public String getCpName() {
		return cpName;
	}
	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public String getCpSecret() {
		return cpSecret;
	}
	public void setCpSecret(String cpSecret) {
		this.cpSecret = cpSecret;
	}
	public String getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	} 
	
}
