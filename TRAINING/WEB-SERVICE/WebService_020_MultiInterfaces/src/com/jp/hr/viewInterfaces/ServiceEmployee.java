package com.jp.hr.viewInterfaces;

import java.util.List;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

public interface ServiceEmployee {
	
	public List<Employee> getEmpList() throws HrException; 
	
	public Employee getEmpDetails(int empId) throws HrException;
	
	public boolean joinNewEmployee(Employee emp) throws HrException;
	
	public int getTestInteger(int x) throws HrException;
}
