package com.amar.letslearn.currencyconversionservice.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversion_multiple;
	private BigDecimal quantity;
	private BigDecimal totalAmount;
	private String port;
	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversion_multiple, BigDecimal quantity,
			BigDecimal totalAmount, String port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversion_multiple = conversion_multiple;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
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
	public BigDecimal getConversionMultiple() {
		return conversion_multiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversion_multiple = conversionMultiple;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	
	
}
