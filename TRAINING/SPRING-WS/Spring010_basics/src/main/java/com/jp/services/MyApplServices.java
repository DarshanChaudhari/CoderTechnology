package com.jp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.jp.dao.MyApplDao;

/* When bean alias is not mentiond, the default is class name in camel case.

	@Component
	*	@ Service : For Declaring service bean.
	*	@ Repository : For declaring dao beans.
	*	@ Controller : For Controller is SpringMVC.
	*	@ RestController : For declaring REST service Layer

*/
//@Component("service") -- Commnet dhis always prefer SErvice annotation
@Service("service")
@Lazy(true)
@Scope("singleton")
public class MyApplServices {
	private MyApplDao dao;
	
	
	public MyApplServices() {
		// This code owns a responsibility of creating an object and holding a reference.
	//	dao = new MyApplDao();
		System.out.println("Object of class MyApplServices() is created");
	}

	// Dependency Injection using the Constructor
	
	@Autowired  				// This is used for to call the below constructor not the above one. This is also Autowiring/Plumbing by type.
	public MyApplServices(MyApplDao dao) {
		this.dao=dao;
		System.out.println("Object of class MyApplServices(dao) is created");
	}
			
}