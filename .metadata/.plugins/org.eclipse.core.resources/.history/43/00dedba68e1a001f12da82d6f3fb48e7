package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller

public class SetterInjectionController {
	
	private GreetingService greetingService;
	
	@Autowired
	@Qualifier("setterGreetingService")
	public void SetGreetingService(GreetingService greetingService) {
		 this.greetingService=greetingService;
	}
	
	public String sayHello() {
		return greetingService.greet();
	}
}		


