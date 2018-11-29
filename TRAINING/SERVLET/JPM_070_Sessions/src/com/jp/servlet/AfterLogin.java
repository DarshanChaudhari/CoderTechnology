package com.jp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * The above two approaches are adapted by java api.
 * 	COOKIE : JSESSIONID.
 * 	URL rewriting : 
 *  HIDDEN field: 
 */
@WebServlet("/afterLogin")
public class AfterLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	
 		HttpSession session = request.getSession(); // Create the session for the user. It will Create a session if not existing
 		System.out.println("From AfterLogin : " + session.getId());  // This id has been created by server side.Browser does not about the ID.
 		
 		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");
 		dispatch.forward(request, response);
	}


 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}