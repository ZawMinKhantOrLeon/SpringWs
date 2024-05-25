package com.hostmdy.di.service.imp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.hostmdy.service.GreetingService;


@Service("i18nGreetingService")
@Profile("KR")
public class KoreaGreetingService implements GreetingService {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "A Nyar Zin Yaw";
	}
		
	
	
}