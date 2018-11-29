package com.jp.config.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*	Note: Declaring context parameters through Annotations. They are to be declared on the listener or Filter.
 Note : Declaring config paramters : 
		They are private to the servlets . They are not accesible to another servlets


*/
//@WebServlet("/process2")

@WebServlet(urlPatterns={"/process3", "/process4"}, 
initParams={@WebInitParam(name="pageHead",value="Employee List"), @WebInitParam(name="footHead",value="Contact Details")})

public class Process1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Within Servlet.");
		
		//Accessing Context
		ServletContext ctx = super.getServletContext();		
		System.out.println(ctx.getInitParameter("CompanyName"));
		
		// Accessing Config
		ServletConfig cfg = super.getServletConfig();
		System.out.println(cfg.getInitParameter("pageHead"));
		System.out.println(cfg.getInitParameter("footHead"));
		
	}
}