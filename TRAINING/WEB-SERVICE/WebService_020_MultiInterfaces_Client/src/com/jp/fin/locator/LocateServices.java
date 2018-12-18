package com.jp.fin.locator;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.jp.fin.exceptions.FinException;
import com.jp.hr.updateInterfaces.EmpSoapServicesUpdate;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;

public class LocateServices {
	
	
	public static EmpSoapServicesView getEmpServices() throws FinException {
		try {
			URL url = new URL("http://localhost:9898/viewHr?wsdl"); // Other machine 			
			QName qname = new QName("http://soap.hr.jp.com/","EmpSoapServiceViewImplService");						 
			Service service = Service.create(url, qname);						
			EmpSoapServicesView soapServices = service.getPort(EmpSoapServicesView.class);
			return soapServices;
			
		} catch (MalformedURLException e) {
			throw new FinException("Soap Services link not established,",e);
		}
	}
	
	public static EmpSoapServicesUpdate updateEmpServices() throws FinException {
		try {
			URL url = new URL("http://localhost:9898/updateHr?wsdl"); // Other machine 			
			QName qname = new QName("http://soap.hr.jp.com/","EmpSoapServiceUpdateImplService");						 
			Service service = Service.create(url, qname);						
			EmpSoapServicesUpdate soapServices = service.getPort(EmpSoapServicesUpdate.class);
			return soapServices;
			
		} catch (MalformedURLException e) {
			throw new FinException("Soap Services link not established,",e);
		}
	}
	

}
