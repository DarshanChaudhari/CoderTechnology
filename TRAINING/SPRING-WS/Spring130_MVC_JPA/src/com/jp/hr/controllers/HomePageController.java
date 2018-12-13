package com.jp.hr.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jp.hr.entities.Dept;
import com.jp.hr.entities.Emp;
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
	@Qualifier("employeeService") // This is will do autowiring for serviceLayer
	private ServiceEmployee empService;
	
	@Autowired
	private Validator validator;
	
	
	@InitBinder
	private void validatorBinder() {
		// This is Java Service Request JSR 303 validator
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();      
        System.out.println("Validator is set."+validator.hashCode());
	}
	
	@RequestMapping("homePage.hr")  // This is the url(command)  for getHomePage method 
	public String getHomePage() {
		System.out.println("In getHomePage()");		
		return "HomePage";
		
	}
	@RequestMapping("empList.hr") // This is the jsp name mentioned as a link name in homePage.jsp
	public ModelAndView getEmpList() {
		ModelAndView mAndV = new ModelAndView();
		try {
			List<Emp> empList = empService.getEmpList();
			mAndV.addObject("empList",empList);			
			mAndV.setViewName("EmpList");
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	@RequestMapping("deptList.hr") // This is the jsp name mentioned as a link name in homePage.jsp
	public ModelAndView getdeptList() {
		ModelAndView mAndV = new ModelAndView();
		try {
			List<Dept> deptList = empService.getDeptList();
			mAndV.addObject("deptList",deptList);			
			mAndV.setViewName("DeptList");
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	
	@RequestMapping("empDetails.hr") // This is the jsp name mentioned as a link name in emplist.jsp
	public ModelAndView getEmpDetails(@RequestParam("id") int empId) {
		System.out.println("In Emp details");		
		ModelAndView mAndV = new ModelAndView();
		try {
			Emp emp = empService.getEmpDetails(empId);
			System.out.println(emp);
			mAndV.addObject("empDetails",emp);
			//Set the View name for JSP
			mAndV.setViewName("EmpDetails"); // This is jsp name, now in this case EmpDetails.jsp
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	@RequestMapping("deptDetails.hr") // This is the jsp name mentioned as a link name in emplist.jsp
	public ModelAndView getdeptDetails(@RequestParam("id") int deptId) {
		System.out.println("In Dept details");		
		ModelAndView mAndV = new ModelAndView();
		try {
			Dept dept = empService.getDeptDetails(deptId);
			System.out.println(dept);
			mAndV.addObject("deptDetails",dept);
			//Set the View name for JSP
			mAndV.setViewName("DeptDetails"); // This is jsp name, now in this case EmpDetails.jsp
			
		} catch (HrException e) {			
			e.printStackTrace();
		}
		return mAndV;		
	}	
	
	@RequestMapping("registrationForm.hr")
	public String getRegistrationForm(Model model) {
			// Define Commond Object
		Emp emp = new Emp();
		model.addAttribute("command",emp);
		return "EntryPage";		
	}
	
	@RequestMapping("submitRegistrationData.hr") // This is the jsp name mentioned as a link name in emplist.jsp
	public String submitRegistrationData(@ModelAttribute("command") Emp emp,  BindingResult result, Model model) {
		System.out.println(emp);		
		// We have apply Validation here		
		Set<ConstraintViolation<Emp>> violations = validator.validate(emp);
		
		for (ConstraintViolation<Emp> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            FieldError error = new FieldError("command",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }		
		
    	if (result.hasErrors()) {
    		model.addAttribute("msg", "Error in entry.");    		
            return "EntryPage";
        } else {
        	try {
    			empService.addNewEmployee(emp);
    			return "SaveSuccess";
    		} catch (HrException e) {
    			model.addAttribute("msg", "Insert failed." + e.getMessage());
    			return "EntryPage";
    		}
        }
		
	}
}
