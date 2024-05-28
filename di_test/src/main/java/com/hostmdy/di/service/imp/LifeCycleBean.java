package com.hostmdy.di.service.imp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("myBean")
public class LifeCycleBean implements InitializingBean ,DisposableBean , BeanNameAware,BeanFactoryAware, ApplicationContextAware {
	
	public LifeCycleBean() {
		System.out.println("Lifecycle Bean is Initialized");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" Bean is currently Inside Application Context");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" Bean is currently Inside BeanFactory ");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("### Bean is currently setting name and name = "+ name + " ###");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying Bean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" Bean properties are Set");
	}
	
	@PostConstruct
	public void postConstruct() {
		
		System.out.println("Lifecycle bean is constructed");
	}
	
	public void beforeLifeCycleBeanInitilaize() {
		System.out.println("Before lifecycle bean is not initilaize");
	}
	
	public void afterLifeCycleBeanInitilaize() {
		System.out.println("Before lifecycle bean is initilaized");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println(" Lifecycle bean is about to be destroy ");
	}

}
