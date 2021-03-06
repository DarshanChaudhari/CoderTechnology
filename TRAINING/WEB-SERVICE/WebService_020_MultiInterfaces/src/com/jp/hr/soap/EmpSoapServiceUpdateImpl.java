package com.jp.hr.soap;
import java.util.List;

import javax.jws.WebService;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.updateInterfaces.EmpSoapServicesUpdate;
import com.jp.hr.utilities.ServiceFactory;


@WebService(endpointInterface="com.jp.hr.updateInterfaces.EmpSoapServicesUpdate")
public class EmpSoapServiceUpdateImpl implements EmpSoapServicesUpdate {

	private ServiceEmployee services;
	
	public EmpSoapServiceUpdateImpl() throws HrException {
		services = ServiceFactory.getService(); // Creating a object of ServiceEmployeeIMpl
	}

	
	@Override
	public boolean joinNewEmployee(Employee emp) throws HrException {
		return services.joinNewEmployee(emp);
	}


	@Override
	public List<Employee> getEmpList() throws HrException {
		return services.getEmpList();
	}

}
