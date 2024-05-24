package com.hostmdy.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.hostmdy.di.service.imp.ConstructorGreetingService;
import com.hostmdy.di.service.imp.CustomBeanPostProcessor;
import com.hostmdy.di.service.imp.JapanGreetingService;
import com.hostmdy.di.service.imp.KoreaGreetingService;
import com.hostmdy.di.service.imp.LifeCycleBean;
import com.hostmdy.di.service.imp.PrimaryGreetingService;
import com.hostmdy.di.service.imp.PropertyGreetingService;
import com.hostmdy.di.service.imp.SetterGreetingService;

@Configuration
public class ServiceBeanConfig {

	@Bean
	ConstructorGreetingService constructorGreetingService() {
		
		return new ConstructorGreetingService();
	}
	
	@Bean
	CustomBeanPostProcessor customBeanPostProcessor() {
		
		return new CustomBeanPostProcessor();
	}
	
	@Bean(name="i18nGreetingService")
	@Profile({"JP","default"})
	JapanGreetingService japanGreetingService() {
		return new JapanGreetingService();
	}
	
	
	
	@Bean(name="i18nGreetingService")
	KoreaGreetingService KoreaGreetingService() {
		return new KoreaGreetingService();
	}
	
	@Bean(name="myBean")
	LifeCycleBean lifeCycleBean() {
		return new LifeCycleBean();
	}
	
	@Bean
	@Primary
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	PropertyGreetingService propertyGreetingService() {
		return new PropertyGreetingService();
	}
	
	@Bean 
	SetterGreetingService setterGreetingService() {
		return new SetterGreetingService();
	}
	
	
	
	
}
