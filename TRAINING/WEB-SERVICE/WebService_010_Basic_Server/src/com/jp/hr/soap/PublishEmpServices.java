package com.jp.hr.soap;

import javax.xml.ws.Endpoint;

import com.jp.hr.interfaces.EmpSoapServices;

//http://localhost:9898/hr?wsdl
public class PublishEmpServices {

	public static void main(String[] args) {
		try {
			EmpSoapServices soapServices = new EmpSoapServiceImpl(); // This is one Interface
			Endpoint.publish("http://localhost:9898/hr", soapServices);
			System.out.println("Services Started");
		} catch (Exception e) {			
			e.printStackTrace();
		} 
	}
}
