/**
 * 
 */
package com.jp.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @C
 *
 */
@Controller
public class HelloController {
	/*
	 * 		Which request it will handle 
	 * -> It will handle hello request-Use @RequestMapping
	 */
	@RequestMapping("/hello")
	public String hello() {
		return "Hello, Welcome to the auto-configurable world of spring boot";
	}
}
