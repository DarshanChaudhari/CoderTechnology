package com.jp.hr.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;

/*
 * link for getempList --> http://localhost:8080/Spring_300_MVC_JPA_REST_Ng/hr/emps
 * link for getempdetails using @RequestParam --> http://localhost:8080/Spring_300_MVC_JPA_REST_Ng/hr/empDetails1?id=10
 * link for getempdetails using @PathVariable --> http://localhost:8080/Spring_300_MVC_JPA_REST_Ng/hr/empDetails2/101
 * 	http://localhost:8080/Spring_300_MVC_JPA_REST_Ng/hr/emps/create/104/Smith/Austin
 */
@RestController // We are using RESTController instead of Controller for REST services
public class HomePageController {
	@Autowired
	@Qualifier("service")
	private ServiceEmployee empService;
	
	
	
	/*@RequestMapping("homePage.hr")
	public String getHomePage(){
		System.out.println("In getHomePage()");
		return "HomePage";
	}*/
	
	
	@RequestMapping(value = "/emps",method = RequestMethod.GET,headers="Accept=application/json")
	public List<Employee> getEmpList(){
		System.out.println("In getEmpList");
		List<Employee> empList = null;
		try {
			empList = empService.getEmpList();
			
		} catch (HrException e) {
			e.printStackTrace();
		}
		return empList;
	}
	
	// To fetch Employee details by using @RequestParam
	@RequestMapping(value = "/empDetails1",method = RequestMethod.GET,headers="Accept=application/json")
	public Employee getEmpDetails1(@RequestParam("id") int empId){
		Employee emp = null;
		System.out.println("In getEmpDetails");
		try {
			emp = empService.getEmpDetails(empId);
			System.out.println(emp);
		} catch (HrException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	// To fetch Employee details by using @PathVariable
	@RequestMapping(value = "/empDetails2/{id}",method = RequestMethod.GET,headers="Accept=application/json")
	public Employee getEmpDetails2(@PathVariable("id") int empId){
		Employee emp = null;
		System.out.println("In getEmpDetails");
		try {
			emp = empService.getEmpDetails(empId);
			System.out.println(emp);
		} catch (HrException e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	
	@RequestMapping(value = "/emps/create/{empId}/{fname}/{lname}",
			headers="Accept=application/json", method = RequestMethod.GET)
	public List<Employee> addEmployee(@PathVariable int empId,@PathVariable String fname,@PathVariable String lname){
		List<Employee> empList = null;
		Employee employee = new Employee(empId,fname,lname);
		/*employee.setEmpId(empId);
		employee.setFirstName(fname);
		employee.setLastName(lname);*/
		System.out.println(employee);
		try {
			empService.joinNewEmployee(employee);
			empList = empService.getEmpList();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}
	
	
	
/*	@RequestMapping("registrationForm.hr")
	public String getRegistrationForm(Model model){
		// Define command object
		Employee emp = new Employee();
		model.addAttribute("command", emp);
		
		return "EntryPage";
	}*/
	
	/*@RequestMapping("submitRegistrationData.hr")
	public String submitRegistrationData(@ModelAttribute("command") Employee emp, BindingResult result, Model model){
		// Define command object
		System.out.println(emp);
		
		Set<ConstraintViolation<Employee>> violations = validator.validate(emp);
    	
    	for (ConstraintViolation<Employee> violation : violations)
        {
            String propertyPath = violation.getPropertyPath().toString();
            String message = violation.getMessage();
            // Add JSR-303 errors to BindingResult. This allows Spring to display them in view via a FieldError
            FieldError error = new FieldError("command",propertyPath,
                    "Invalid "+ propertyPath + "(" + message + ")");
            result.addError(error);
        }
    	
    	if (result.hasErrors()) {
    		model.addAttribute("msg", "Errors in entry.  ");
            return "EntryPage";
        } else {
        	try {
    			empService.joinNewEmployee(emp);
    			return "SaveSuccess";
    		} catch (HrException e) {
    			model.addAttribute("msg", "Insert failed.  " + e.getMessage());
    			return "EntryPage";
    		}
        }
	}*/
}