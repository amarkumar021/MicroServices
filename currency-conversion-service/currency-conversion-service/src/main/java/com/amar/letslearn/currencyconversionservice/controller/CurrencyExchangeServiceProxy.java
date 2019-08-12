package com.amar.letslearn.currencyconversionservice.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.amar.letslearn.currencyconversionservice.bean.ExchangeValue;

@FeignClient(name = "netflix-zuul-gateway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("/currency-exchange-service/curency-exchnage/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
