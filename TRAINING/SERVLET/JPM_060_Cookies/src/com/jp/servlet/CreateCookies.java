package com.jp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookies
 */
@WebServlet("/createCookies")
public class CreateCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie1 = new Cookie("c1", "Session-cookie");
		Cookie cookie2 = new Cookie("c2", "Persistent-cookie");
		
		cookie2.setMaxAge(120);  // In Seconds - It is set for 2 mins after two mins it will vanish
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.sendRedirect("showCookies");  // Redirect to another servlet for this we have to crate another servlet
		
		
	}

	

}