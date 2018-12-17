package com.jp.hr.soap;

import javax.xml.ws.Endpoint;

import com.jp.hr.updateInterfaces.EmpSoapServicesUpdate;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;

//http://localhost:9898/viewHr?wsdl --> View 
//http://localhost:9898/updateHr?wsdl-->Update 
public class PublishEmpServices {

	public static void main(String[] args) {
		try {
			EmpSoapServicesView viewServices = new EmpSoapServiceViewImpl(); // This is one Interface
			Endpoint.publish("http://localhost:9898/viewHr", viewServices);
			
			EmpSoapServicesUpdate updateServices = new EmpSoapServiceUpdateImpl(); // This is one Interface
			Endpoint.publish("http://localhost:9898/updateHr", updateServices);
			
			
			System.out.println("Services started.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
