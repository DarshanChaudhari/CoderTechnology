package com.jpm.learning.webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
import java.util.Scanner;

public class Client {

	public static void main(String args[]) throws Exception {
		URL url = new URL("http://localhost:9876/cs?wsdl"); // Client side is referring to wsdl
		//URL url = new URL("http://192.168.1.131:9876/cs?wsdl"); // Other machine 
		// Qualified name of the service:
		// 1st arg is the service URI
		// 2nd is the service name published in the WSDL
		QName qname = new QName("http://webservice.learning.jpm.com/","CalculatorService");
		 

		// Create, in effect, a factory for the service.
		Service service = Service.create(url, qname);

		// Extract the endpoint interface, the service "port".
		CalculatorServer endPointIntf = service.getPort(CalculatorServer.class); /* Getting Proxy object doest not have original object mentioend in calculator
																					The super Interface of proxy is same as original object
																					Original logic never come out of the server side - Calculator, Calculalator Publisher
																					and CalculatorServer */	

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number for calulator operations");
		int number1 = scanner.nextInt();
		System.out.println("Enter 2nd number for calulator operations");
		int number2 = scanner.nextInt();
		System.out.println("Addition::\t"
				+ endPointIntf.addition(number1, number2));
		System.out.println("Subtraction::\t"
				+ endPointIntf.subtraction(number1, number2));
		System.out.println("Division::\t"
				+ endPointIntf.division(number1, number2));
		System.out.println("Multiplication::\t"
				+ endPointIntf.multiplication(number1, number2));
		System.out.println("Modulus::\t"
				+ endPointIntf.modulus(number1, number2));
	}

}
