package com.jp.hr.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jp.hr.services.MyServices;

public class TestAOP {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		MyServices services = ctx.getBean(MyServices.class);
		
		/*
		 * When you call services.abcMethod1(), the control will go to the MyServices class and then the controls before inside the method it will go to Security Check becuase of Aspect .
		 * Here the Interception play a role.
		 */
		services.abcMethod1();
		services.abcMethod2(10);
		services.abcMethod3(10,20);

	}

}