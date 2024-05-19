package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class PropertyInjectionController {
	
	@Autowired
	public GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.greet();
	}
}
