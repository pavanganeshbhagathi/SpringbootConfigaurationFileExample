package com.versiontwo.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.versiontwo.microservices.beans.Limits;
import com.versiontwo.microservices.configauration.Configuaration;

@RestController
public class LimitsController {
	
@Autowired	
private	Configuaration configauration;


	@GetMapping("/limits")
	public Limits retriveLimits() {

		return new Limits(configauration.getMinimun(),configauration.getMaximum());
	}
}
