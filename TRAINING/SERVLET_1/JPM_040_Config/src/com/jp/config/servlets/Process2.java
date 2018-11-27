package com.jp.config.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Process2
 */
//@WebServlet("/process2")
public class Process2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	Lazy Instantiation : Deferring the object creation until the receipt of first request.
	public Process2() {
		System.out.println("Object Created");
	}
	
	
	/**
	
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Within Process2");
		
		ServletContext ctx = super.getServletContext();
		System.out.println(ctx.getInitParameter("CompanyName"));
		
		
		ServletConfig cfg = super.getServletConfig();
		System.out.println(cfg.getInitParameter("PageHead"));
	}

}
