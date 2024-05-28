package com.hostmdy.di.service.imp;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service("i18nGreetingService")
@Profile({"JP","default"})
public class JapanGreetingService implements GreetingService {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Ko Ni Chi Wa";
	}

}
