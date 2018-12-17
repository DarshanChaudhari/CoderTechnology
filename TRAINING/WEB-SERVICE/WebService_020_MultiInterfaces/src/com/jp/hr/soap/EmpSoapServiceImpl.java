package com.jp.hr.soap;
import java.util.List;
import javax.jws.WebService;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployeeImpl;
import com.jp.hr.viewInterfaces.EmpSoapServices;
import com.jp.hr.viewInterfaces.ServiceEmployee;

@WebService(endpointInterface="com.jp.hr.viewInterfaces.EmpSoapServices")
public class EmpSoapServiceImpl implements EmpSoapServices {

	private ServiceEmployee services;
	
	public EmpSoapServiceImpl() throws HrException {
		services = new ServiceEmployeeImpl();  // Creating a object of ServiceEmployeeIMpl
	}


	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		return services.getEmpDetails(empId);
	}

	@Override
	public List<Employee> getEmpList() throws HrException {
		return services.getEmpList();
	}


}
