package com.amar.letslearn.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amar.letslearn.limitsservice.bean.LimitConfiguration;
import com.amar.letslearn.limitsservice.config.ConfigReader;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private ConfigReader configReader;
	
	@GetMapping("/limits")
	public LimitConfiguration getConfigutation() {
		return new LimitConfiguration(configReader.getMinimum(), configReader.getMaximum());
	}
}
