package com.hostmdy.di.controller;

import com.hostmdy.di.service.GreetingService;

public class I18nController {
	
	private final GreetingService greetingService;

	public I18nController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.greet();
	}
	
}
