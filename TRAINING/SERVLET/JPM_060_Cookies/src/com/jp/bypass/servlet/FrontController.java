package com.jp.bypass.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 * 
 */
// My URl would be like this when i start servlet :  http://localhost:8080/ProjectName/*.do?page=Welcome
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//This to show if there is the cookies it will bypass Welcome page, if there is no cookies then it will redirect to Welcome. 
	//for this we have to two create two jsp welcome.jsp and main
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		RequestDispatcher dispatch=null;
		
		switch(page) {
		case "Welcome" : {
			// Accessing the cookies which is in Menu.
			Cookie [] cookies = request.getCookies();
			dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Welcome.jsp");
			
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("bypassPage")) {
					dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");
					break; // break is for loop 
				} 
			}
			
			dispatch.forward(request, response);
			break;
		}
		
		case "Menu" : {

			String isBoxChecked = request.getParameter("ToBypass");
			System.out.println(isBoxChecked);
			if (isBoxChecked!=null) {
				// Creating the cookie 
				Cookie c = new Cookie("bypassPage","CookiePrinter");
//				c.setMaxAge(60*60*48);
				c.setMaxAge(120);
				response.addCookie(c);
			}
			dispatch = request.getRequestDispatcher("/WEB-INF/jsps/MainMenu.jsp");
			dispatch.forward(request, response);
			break;
		}
		
	}
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}