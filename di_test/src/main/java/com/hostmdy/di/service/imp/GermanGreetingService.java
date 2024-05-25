package com.hostmdy.di.service.imp;
import com.hostmdy.di.repository.GreetingRepository;
import com.hostmdy.di.service.GreetingService;


public class GermanGreetingService implements GreetingService{

	private final GreetingRepository greetingRepository;
	
	public GermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository=greetingRepository;
	}
	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return greetingRepository.getGermanMessage();
	}

}
