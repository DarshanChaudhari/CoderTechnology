package com.jp.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8080/Spring100_MVCBasics/homePage
// We have to use Annotation as a controller 
@Controller
public class HomePageControllerf {
	
	@RequestMapping("/homePage")  // This is the url(command)  for getHomePage method 
	public String getHomePage() {
		System.out.println("In GetHomePage()");		
		return "/HomePage.jsp";
		
	}

	
}
