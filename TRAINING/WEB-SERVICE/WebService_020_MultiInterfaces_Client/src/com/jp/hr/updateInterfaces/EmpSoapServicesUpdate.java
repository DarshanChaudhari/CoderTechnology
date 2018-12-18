package com.jp.hr.updateInterfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface EmpSoapServicesUpdate {
	
	@WebMethod
	public List<Employee> getEmpList() throws HrException; 
		
	@WebMethod
	public boolean joinNewEmployee(Employee emp) throws HrException;
}
