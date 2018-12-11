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
	 * [.* means all methods]
	 * [(..)  means any Type of parameters]
	 */ 
	
	@Around("execution(* com.jp.hr.services.MyServices.*(..))")
	public Object checkAuthorization(ProceedingJoinPoint doCall) throws Throwable {
		
		System.out.println("Check for Authorization");
		Object obj = doCall.proceed();
		System.out.println("Logging");
		return obj;		
	}
}
