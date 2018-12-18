package com.jp.fin.tests;

import com.jp.fin.exceptions.FinException;
import com.jp.fin.locator.LocateServices;
import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.updateInterfaces.EmpSoapServicesUpdate;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;

public class TestFinServices {

	public static void main(String[] args) {
		try {							
					
			EmpSoapServicesView viewSoapServices = LocateServices.getEmpServices(); // FinException is coming from this line
			System.out.println(viewSoapServices.getEmpDetails(1)); // HrException is coming from this line
			System.out.println(viewSoapServices.getEmpList());
			
			EmpSoapServicesUpdate updateSoapServices = LocateServices.updateEmpServices();
			Employee emp = new Employee(106,"Michael","Jackson");
			System.out.println(updateSoapServices.joinNewEmployee(emp));
			System.out.println(updateSoapServices.getEmpList());
			
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FinException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
