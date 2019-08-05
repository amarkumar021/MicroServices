package com.amar.letslearn.currencyconversionservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.amar.letslearn.currencyconversionservice.bean.ExchangeValue;

@FeignClient(name = "currency-exchange-service", url = "localhost:8100")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("/curency-exchnage/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
