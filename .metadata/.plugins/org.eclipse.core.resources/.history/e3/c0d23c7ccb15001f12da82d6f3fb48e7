package com.hostmdy.di.controller;

import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class ConstructorInjectionController {
	
	private final GreetingService greetingService ;

	public ConstructorInjectionController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.greet();
	}
	
}
