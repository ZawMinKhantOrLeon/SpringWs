package com.hostmdy.di.controller;

import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class PrimaryController {
	
	private final GreetingService greetingService;

	public PrimaryController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.greet();
	}
}
