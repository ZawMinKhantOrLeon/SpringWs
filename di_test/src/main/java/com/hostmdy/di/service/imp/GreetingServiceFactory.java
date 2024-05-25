package com.hostmdy.di.service.imp;

import com.hostmdy.di.repository.GreetingRepository;
import com.hostmdy.di.service.GreetingService;

public class GreetingServiceFactory {
	
	private final GreetingRepository greetingRepository;
	
	
	
	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}



	public GreetingService getGreetingService(String lang) {
		
		return switch(lang) {
		case "en" -> new EnglishGreetingService(greetingRepository);
		case "es" -> new SpanishGreetingService(greetingRepository);
		case "gr" -> new GermanGreetingService(greetingRepository);
		case "fr" -> new FrenchGreetingService(greetingRepository);
		
		default -> {
			throw new IllegalArgumentException("Unexpected value " + lang);
		}
		};
     }
}
