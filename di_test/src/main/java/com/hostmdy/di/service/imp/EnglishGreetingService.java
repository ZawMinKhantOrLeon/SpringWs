package com.hostmdy.di.service.imp;
import com.hostmdy.di.repository.GreetingRepository;
import com.hostmdy.di.service.GreetingService;


public class EnglishGreetingService implements GreetingService{

	private final GreetingRepository greetingRepository;
	
	public EnglishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository=greetingRepository;
	}
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greetingRepository.getEnglishMessage();
	}

}
