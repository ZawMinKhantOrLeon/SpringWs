package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.hostmdy.di.controller.ConstructorInjectionController;
import com.hostmdy.di.controller.I18nController;
import com.hostmdy.di.controller.PrimaryController;
import com.hostmdy.di.controller.PropertyInjectionController;
import com.hostmdy.di.controller.SetterInjectionController;


@SpringBootApplication
@ComponentScan({"com.hostmdy.service","com.hostmdy.di.controller","com.hostmdy.di.service.imp"})
public class DiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DiTestApplication.class, args);
		
		PropertyInjectionController controller = context.getBean(PropertyInjectionController.class);
		System.out.println(controller.sayHello());
		
		SetterInjectionController controller1 = context.getBean(SetterInjectionController.class);
		System.out.println(controller1.sayHello());
		
		ConstructorInjectionController controller2 = context.getBean(ConstructorInjectionController.class);
		System.out.println(controller2.sayHello());
		
		PrimaryController controller3 = context.getBean(PrimaryController.class);
		System.out.println(controller3.sayHello());
		
		I18nController controller4 = context.getBean(I18nController.class);
		System.out.println(controller4.sayHello());
	}

}
