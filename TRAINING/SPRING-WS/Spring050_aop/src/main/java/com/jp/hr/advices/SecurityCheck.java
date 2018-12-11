package com.jp.hr.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/*
 *  <aop:aspectj-autoproxy /> means third policy
 */
@Aspect
public class SecurityCheck {
	
	/*  This is all about Point Cut
	 * [* before execution : is for return type]
	 * [.* means all methods] --> Join Point
	 * [(..)  means any Type of parameters]
	 * If you want to execute particular method then you have to give end character of method name. This is pointcut
	 * 	"execution(* com.jp.hr.services.MyServices.*(*,*))"
	 * Here one (*,*) --> means two parameters (*) --> one parameter
	 * 
	 */ 
		
	// Advice Class
	// All parameters
	/*@Around("execution(* com.jp.hr.services.MyServices.*(..))")*/
	//Only Accepting two parameters
	@Around("execution(* com.jp.hr.services.MyServices.*(*,*))")  // pointcut
	
	// Within
//	@Around("within(* com.jp.hr.services.MyServices)")
	public Object checkAuthorization(ProceedingJoinPoint doCall) throws Throwable {
		
		System.out.println("Check for Authorization");
		Object obj = doCall.proceed();
		System.out.println("Logging");
		return obj;		
	}
}
