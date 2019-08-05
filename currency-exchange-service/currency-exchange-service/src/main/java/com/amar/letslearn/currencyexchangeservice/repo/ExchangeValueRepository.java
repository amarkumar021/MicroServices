package com.amar.letslearn.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amar.letslearn.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends 
		JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);
}