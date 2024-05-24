package com.hostmdy.di.service.imp;

import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;


public class PropertyGreetingService implements GreetingService {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Hello Property Injection";
	}
	
	
}
