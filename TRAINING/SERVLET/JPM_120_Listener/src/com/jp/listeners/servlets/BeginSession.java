package com.jp.listeners.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/beginSession")
public class BeginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // This will create the session
		/*		 
		 * --> getSession()/ getSession(true) ; If session exists :Bring the reference of session Otherwise create new session.
		   --> getSession(false) : If session exists : Bring the reference of session otherwise return null.
		 */
		
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MyJSP.jsp");
		dispatch.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
