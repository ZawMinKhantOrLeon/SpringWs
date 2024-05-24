package com.hostmdy.di.service.imp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

 
public class CustomBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof LifeCycleBean) {
			LifeCycleBean lifeCycleBean =  (LifeCycleBean) bean;
			lifeCycleBean.beforeLifeCycleBeanInitilaize();
			return lifeCycleBean;
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		
		if(bean instanceof LifeCycleBean) {
			LifeCycleBean lifeCycleBean =  (LifeCycleBean) bean;
			lifeCycleBean.afterLifeCycleBeanInitilaize();
			return lifeCycleBean;
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
