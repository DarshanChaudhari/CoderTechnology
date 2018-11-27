package com.jp.hr.servlets;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")		// Generic url [.do is the filteration]
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceEmployee services; // Create a reference of Interface

	/**
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = getCommand(request.getRequestURI());
		
		try {
			switch(command) {		
				case "empList" :{
					ArrayList<Employee> empList = services.getEmpList();
					System.out.println(empList);				
				}
			}
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

		@Override
	public void init() throws ServletException {
		services = new ServiceEmployeeImpl();  // Create a object of Interface of ServiceEmployee Implementation
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
		
		
	private String getCommand(String uri) {
		
		int leftPos =uri.lastIndexOf("/");
		int rtPos = uri.lastIndexOf(".");
		return uri.substring(leftPos+1, rtPos);		
	}
}
