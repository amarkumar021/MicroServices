package com.amar.letslearn.currencyconversionservice.bean;

import java.math.BigDecimal;

public class ExchangeValue {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversion_multiple;
	private String port;
	
	public ExchangeValue(Long id, String from, String to, BigDecimal exchangeValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion_multiple = exchangeValue;
	}
	public ExchangeValue() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getExchangeValue() {
		return conversion_multiple;
	}
	public void setExchangeValue(BigDecimal exchangeValue) {
		this.conversion_multiple = exchangeValue;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	

}
