package com.amar.letslearn.currencyexchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	private Long id;
	@Column(name="Currency_from")
	private String from;
	@Column(name="Currency_to")
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
