package com.jp.hr.controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;

// http://localhost:8080/Spring110_MVCBasics/homePage.do
// We have to use Annotation as a controller


/*
 * @Controller : A kind of @Component to declare a SpringMVC controllers.
 * @RequestMapping : To Map a controlling method to the URL.
 * @RequestParam : To take single QueryString or FormData field value.
 * 
 * Multi-Action Controllers methods over here are called as Multi-Action Controller 
 */
@Controller
public class HomePageController {
	
	@Autowired
	@Qualifier("service") // This is will do autowiring for serviceLayer
	private ServiceEmployee empService;
	
	@RequestMapping("homePage.do")  // This is the url(command)  for getHomePage method 
	public String getHomePage() {
		System.out.println("In getHomePage()");		
		return "HomePage";
		
	}
	@RequestMapping("empList.do") // This is the jsp name mentioned as a link name in homePage.jsp
	public ModelAndView getEmpList() {
		ModelAndView mAndV = new ModelAndView();
		try {
			ArrayList<Employee> empList = empService.getEmpList();
			mAndV.addObject("empList",empList);			
			mAndV.setViewName("EmpList");
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	@RequestMapping("empDetails.do") // This is the jsp name mentioned as a link name in emplist.jsp
	public ModelAndView getEmpDetails(HttpServletRequest request, @RequestParam("id") int empId) {
		
		/* This have been commented becuase in parameters i have directly taken the variable as Int 
				String strEmpId = request.getParameter("id");
				int empId = Integer.parseInt(strEmpId);
		*/
		ModelAndView mAndV = new ModelAndView();
		try {
			Employee emp = empService.getEmpDetails(empId);
			mAndV.addObject("empDetails",emp);
			//Set the View name for JSP
			mAndV.setViewName("EmpDetails"); // This is jsp name, now in this case EmpDetails.jsp
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
}
