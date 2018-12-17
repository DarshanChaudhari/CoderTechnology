package com.jp.hr.soap;

import javax.jws.WebService;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.EmpSoapServices;
import com.jp.hr.interfaces.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;

@WebService(endpointInterface="com.jp.hr.interfaces.EmpSoapServices")
public class EmpSoapServiceImpl implements EmpSoapServices {

	private ServiceEmployee services;
	
	public EmpSoapServiceImpl() throws HrException {
		services = new ServiceEmployeeImpl();
	}
	
	@Override
	public int getTestInteger(int x) throws HrException {
		return services.getTestInteger(x);
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		return services.getEmpDetails(empId);
	}
}
