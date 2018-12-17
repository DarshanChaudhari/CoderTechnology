package com.jp.hr.soap;
import java.util.List;
import javax.jws.WebService;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;
import com.jp.hr.utilities.ServiceFactory;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;


@WebService(endpointInterface="com.jp.hr.viewInterfaces.EmpSoapServicesView")
public class EmpSoapServiceViewImpl implements EmpSoapServicesView {

	private ServiceEmployee services;
	
	public EmpSoapServiceViewImpl() throws HrException {
		services = ServiceFactory.getService();
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
