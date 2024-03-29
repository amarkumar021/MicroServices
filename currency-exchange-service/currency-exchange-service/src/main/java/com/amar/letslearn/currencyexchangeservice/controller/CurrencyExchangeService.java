package com.amar.letslearn.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amar.letslearn.currencyexchangeservice.bean.ExchangeValue;
import com.amar.letslearn.currencyexchangeservice.repo.ExchangeValueRepository;

@RestController
public class CurrencyExchangeService {
	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/curency-exchnage/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(env.getProperty("local.server.port"));
		return exchangeValue;
		
	}
}
