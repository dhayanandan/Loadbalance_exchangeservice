package com.dhayanandan.microservice.loadbalancer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/hello-world")
	public String getFirstString()
	{
		return "Welcome to Spring boot";
	}

}
