package com.hostmdy.di.service.imp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;


public class PrimaryGreetingService implements GreetingService{

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Primary Service";
	}

}
