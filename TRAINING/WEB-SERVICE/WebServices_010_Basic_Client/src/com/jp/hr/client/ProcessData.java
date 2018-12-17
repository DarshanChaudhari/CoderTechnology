package com.jp.hr.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.EmpSoapServices;

public class ProcessData {
	
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:9898/hr?wsdl"); // Other machine 
			// Qualified name of the service:
			// 1st arg is the service URI
			// 2nd is the service name published in the WSDL
			QName qname = new QName("http://soap.hr.jp.com/","EmpSoapServiceImplService");
						 
			// Create, in effect, a factory for the service.
			Service service = Service.create(url, qname);
			
			// Extract the end point interface, the service "port".
			EmpSoapServices soapServices = service.getPort(EmpSoapServices.class);
			System.out.println(soapServices.getTestInteger(10));
			
			Employee emp = soapServices.getEmpDetails(102); 
			System.out.println(emp);
			
			List<Employee> empList = soapServices.getEmpList();
			for (Employee emp1 :empList) {
				System.out.println(emp1);
			}
			
			Employee employee = new Employee();
			employee.setEmpId(4);
			employee.setFirstName("John");
			employee.setLastName("Matthe");
			if (soapServices.joinNewEmployee(employee)) {
				System.out.println("New Employee joined Sucessfully");
			} else {
				System.out.println("New Employee not joined ");
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
