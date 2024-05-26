package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.GreetingController;
import com.hostmdy.di.datasource.FakeDataSource;
import com.hostmdy.di.datasource.CloudDataSource;

@SpringBootApplication
public class DiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DiTestApplication.class, args);
		
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println("DataSource Information : ");
		System.out.println("Username : "+ fakeDataSource.getUsername());
		System.out.println("Password : "+ fakeDataSource.getPassword());
		System.out.println("Url : "+ fakeDataSource.getUrl());
		System.out.println("Engine : "+ fakeDataSource.getEngine());
		
		CloudDataSource cloudDataSource = context.getBean(CloudDataSource.class);
		System.out.println("CloudDataSource Information : ");
		System.out.println("Username : "+ cloudDataSource.getUser());
		System.out.println("Key : "+ cloudDataSource.getKey());
		System.out.println("Auth : "+ cloudDataSource.getAuth());
		System.out.println("Address : "+ cloudDataSource.getAddress());
	}

}
