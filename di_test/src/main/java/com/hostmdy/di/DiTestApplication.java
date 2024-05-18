package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.GreetingController;
import com.hostmdy.di.service.GreetingService;
import com.hostmdy.di.service.imp.GreetingServiceImpl;

@SpringBootApplication
public class DiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DiTestApplication.class, args);
		
		
		GreetingService greetingService = new GreetingServiceImpl();
		GreetingController controller = new GreetingController(greetingService);
		
		System.out.println(controller.sayHello());
	}

}
