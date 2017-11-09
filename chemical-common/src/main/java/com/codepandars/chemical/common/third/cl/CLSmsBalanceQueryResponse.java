package com.codepandars.chemical.common.third.cl;

/**
 * 创蓝短信存量信息
 * @author cz
 *
 */
public class CLSmsBalanceQueryResponse  extends SmsBalance{

	/**
	 * 存量查询时间
	 */
	private String queryDateTime;
		
	/**
	 * 账号
	 */
	private String account ;
	
	/**
	 * 产品ID
	 */
	private String productId ;
	
	/**
	 * 余额
	 */
	private Integer balance ;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getQueryDateTime() {
		return queryDateTime;
	}

	public void setQueryDateTime(String queryDateTime) {
		this.queryDateTime = queryDateTime;
	}

	@Override
	public String toString() {
		return "CLSmsBalanceQueryResponse [queryDateTime=" + queryDateTime + ", account=" + account + ", productId="
				+ productId + ", balance=" + balance + "]";
	}
	
}
