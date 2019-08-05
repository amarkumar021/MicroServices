package com.amar.letslearn.currencyconversionservice.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amar.letslearn.currencyconversionservice.bean.CurrencyConversionBean;
import com.amar.letslearn.currencyconversionservice.bean.ExchangeValue;

@RestController
public class CurrencyConversionService {

	private Map<String, String> uriVariables;

	@Autowired
	private CurrencyExchangeServiceProxy currencyConversionService;
	
	@GetMapping("/currency-conversion/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getCurrencyConversionValue(@PathVariable("from") String from,
			@PathVariable("to") String to, @PathVariable("quantity") BigDecimal quantity) {

		uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<ExchangeValue> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8100/curency-exchnage/from/{from}/to/{to}", ExchangeValue.class,
				uriVariables);
		ExchangeValue response = responseEntity.getBody();
		return new CurrencyConversionBean(response.getId(), from, to, response.getExchangeValue(),
				quantity, response.getExchangeValue().multiply(quantity), response.getPort().toString());
	}
	
	@GetMapping("/currency-conversion-feign/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean getCurrencyConversionValueFeign(@PathVariable("from") String from,
			@PathVariable("to") String to, @PathVariable("quantity") BigDecimal quantity) {

		ExchangeValue response = currencyConversionService.getExchangeValue(from, to);
		return new CurrencyConversionBean(response.getId(), from, to, response.getExchangeValue(),
				quantity, response.getExchangeValue().multiply(quantity), response.getPort().toString());
	}
}
