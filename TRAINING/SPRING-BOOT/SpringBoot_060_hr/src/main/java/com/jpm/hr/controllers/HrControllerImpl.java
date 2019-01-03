package com.jpm.hr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpm.hr.services.IHrService;

@Controller
public class HrControllerImpl {

	@Autowired
	@Qualifier("hrServices")
	private IHrService services;
	
	@RequestMapping("/home")
	public String getHomePage() {
		return "Home";
		
	}
	
}
