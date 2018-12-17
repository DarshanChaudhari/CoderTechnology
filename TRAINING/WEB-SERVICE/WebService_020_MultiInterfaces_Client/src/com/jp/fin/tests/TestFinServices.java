package com.jp.fin.tests;

import com.jp.fin.exceptions.FinException;
import com.jp.fin.locator.LocateServices;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;

public class TestFinServices {

	public static void main(String[] args) {
		try {
			
					
					
			EmpSoapServicesView soapServices = LocateServices.getEmpServices(); // FinException is coming from this line
			System.out.println(soapServices.getEmpDetails(1)); // HrException is coming from this line
			System.out.println(soapServices.getEmpList());
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FinException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
