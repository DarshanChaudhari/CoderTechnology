/**
 * 
 */
package com.jp.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @C
 *
 */
@RestController
public class HelloController {
	/*
	 * 		Which request it will handle 
	 * -> It will handle hello request-Use @RequestMapping
	 */
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello World");
		return "Hello, Welcome to the auto-configurable world of spring boot";
	}
	
	
	@RequestMapping(value = "/helloUser/{userName}",method = RequestMethod.GET,headers="Accept=application/json")
	public String greetUser(@PathVariable String userName){
		return "Hello " + userName;
		
	}
}
