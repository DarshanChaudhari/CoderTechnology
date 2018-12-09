package com.jp.shopping.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = getCommand(request.getRequestURI());
		System.out.println(command);
		
		String jspName = "";
		String prefix = "/WEB-INF/jsps/";
		String postfix = ".jsp";
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

	
	private String getCommand(String uri) {		
		
		int leftPos =uri.lastIndexOf("/");
		int rtPos = uri.lastIndexOf(".");
		if (rtPos<=leftPos) {
			return "home";
		}
		return uri.substring(leftPos+1, rtPos);		
	}
}
