/**
 * 
 */
package com.jp.hr.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.jp.hr.entities.Employee;

/**
 * @C
 *
 */
@RestController
public class EmployeeController {
	/*
	 * 		Which request it will handle 
	 * -> It will handle hello request-Use @RequestMapping
	 */
	
	@RequestMapping(value = "/empList",
			method = RequestMethod.GET,
			headers="Accept=application/json")
	public String getEmpList(){
		return "EmpList" ;
		
	}
	
	
	@RequestMapping(value = "/empDetails/{empId}",
			method = RequestMethod.GET,
			headers="Accept=application/json")
	public String getEmpDetails(@PathVariable int empId){
		return "Employee with employee ID " + empId;		
	}
	
	@RequestMapping(value = "/createEmployee/{empId}/{fname}/{lname}",
			headers="Accept=application/json", method = RequestMethod.GET)
	public List<Employee> addEmployee(@PathVariable int empId,@PathVariable String fname,@PathVariable String lname){
		List<Employee> empList = null;
		Employee employee = new Employee(empId,fname,lname);		
		System.out.println(employee);
	/*	try {
			empService.joinNewEmployee(employee);
			empList = empService.getEmpList();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		return null ;
	}
	
	@RequestMapping(value = "/removeEmployee/{empId}",
			method = RequestMethod.GET,
			headers="Accept=application/json")
	public String removeEmployee(@PathVariable int empId){
		return "Employee with employee ID " + empId + " removed";		
	}
}
