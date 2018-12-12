package com.jp.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8080/Spring110_MVCBasics/homePage.do
// We have to use Annotation as a controller 
@com.jp.hr.controllers
public class HomePageControllerf {
	
	@RequestMapping("homePage.do")  // This is the url(command)  for getHomePage method 
	public String getHomePage() {
		System.out.println("In getHomePage()");		
		return "/HomePage.jsp";
		
	}

	
}