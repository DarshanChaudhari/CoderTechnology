package com.jp.hr.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/*
 * 	The Implementation of InitializingBean interface 
 		* The name of implementing method cannot be customizable
 		* The exception being throw can not be changed.
 		* The initializing code cannot be grouped as per category in different methods.
 		* The interface tightly bound the code to Spring framework API.
 		* 
 *	The ApplicationContextAware is an Interface to inject SpirngContext Reference within bean
 	 	*	Such a reference can be used to achieve Dependency relationship. 	 	
 		* LifeCycle :
 		* 		1. Object created and constructor invoked
 		* 		2. All setter methods (Value and Reference initialization).
 		* 		3. All Aware Methods
 		* 		4. The init() methods (@PostConstruct, afterPropertiesSet())
 	  			
 */

@Component("service")
public class ServiceBean implements InitializingBean, ApplicationContextAware{

	private int x;
	private ApplicationContext ctx;
	
	
	public ServiceBean() {
		super();
		System.out.println("In No Parameter Constructor ");
	}

	@Autowired
	public ServiceBean(@Value("10") int x) {
		this.x = x;
		System.out.println("In Constructor "  + x);
	}	
	
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ctx = arg0;
		System.out.println("Setting Application Context");
	}
	
	
	@Value("20")
	public void setValueX(int x) {
		this.x = x;
		System.out.println("In Setter Method " + x);
	}
	
	
	@PostConstruct
	public void validateConfig() {
		System.out.println("In ValidateConfig");
		if (x > 100) {
			System.out.println("Wrong Input");
		}
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In afterPropertiesSet");
		
	}
	
	

	@Override
	public String toString() {
		return "ServiceBean [x=" + x + "]";
	}

	
	public void myServices() {
		ctx.getBean("");  // If you want to reference in method then used ctx.getBean, In this memory management is better.
	}
	
}
