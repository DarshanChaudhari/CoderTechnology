package com.jp.hr.soap;

import javax.xml.ws.Endpoint;

import com.jp.hr.viewInterfaces.EmpSoapServices;

//http://localhost:9898/hr?wsdl
public class PublishEmpServices {

	public static void main(String[] args) {
		try {
			EmpSoapServices soapServices = new EmpSoapServiceImpl(); // This is one Interface
			Endpoint.publish("http://localhost:9898/hr", soapServices);
			System.out.println("Services started.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
