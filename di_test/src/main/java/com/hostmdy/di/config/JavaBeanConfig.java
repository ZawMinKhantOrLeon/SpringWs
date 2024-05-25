package com.hostmdy.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hostmdy.di.service.GreetingService;
import com.hostmdy.di.controller.I18nController;
import com.hostmdy.di.repository.GreetingRepository;
import com.hostmdy.di.service.imp.GreetingServiceFactory;

@Configuration
public class JavaBeanConfig {
	
	private final GreetingRepository greetingRepository;
	
	
	
	public JavaBeanConfig(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	@Bean
	GreetingServiceFactory greetingServiceFactory() {
		return new GreetingServiceFactory(greetingRepository);
		
	}
	
	@Bean
	GreetingService englishGreetingService() {
		return new GreetingServiceFactory(greetingRepository).getGreetingService("en");
	}
	
	@Bean
	GreetingService spanishGreetingService() {
		return new GreetingServiceFactory(greetingRepository).getGreetingService("es");
	}
	
	@Bean
	GreetingService frenchGreetingService() {
		return new GreetingServiceFactory(greetingRepository).getGreetingService("fr");
	}

	@Bean
	GreetingService germanGreetingService() {
		return new GreetingServiceFactory(greetingRepository).getGreetingService("gr");
	}
	
	@Bean
	I18nController  i18nController() {
		return new I18nController(frenchGreetingService());
	}
}