package com.fq.entity.vo;

public class ThirdCartoonIncomeVO {
	private String createDate ; 
	private Integer plcId  ; 
	private Integer readingNum ; 
	private String jpoint ;
	private String  baseMoney ;
	private String  totalRatio ;
	private String  subsidyRatio ;
	private String income ; //三方收入
	
	
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Integer getPlcId() {
		return plcId;
	}
	public void setPlcId(Integer plcId) {
		this.plcId = plcId;
	}
	public Integer getReadingNum() {
		return readingNum;
	}
	public void setReadingNum(Integer readingNum) {
		this.readingNum = readingNum;
	}
	
	public String getJpoint() {
		return jpoint;
	}
	public void setJpoint(String jpoint) {
		this.jpoint = jpoint;
	}
	public String getBaseMoney() {
		return baseMoney;
	}
	public void setBaseMoney(String baseMoney) {
		this.baseMoney = baseMoney;
	}
	public String getTotalRatio() {
		return totalRatio;
	}
	public void setTotalRatio(String totalRatio) {
		this.totalRatio = totalRatio;
	}
	public String getSubsidyRatio() {
		return subsidyRatio;
	}
	public void setSubsidyRatio(String subsidyRatio) {
		this.subsidyRatio = subsidyRatio;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	
	
}
