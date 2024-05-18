package com.hostmdy.di.service.imp;

import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final  String GREET_WORD = "Hello";
	
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return GREET_WORD;
	}

	
}
