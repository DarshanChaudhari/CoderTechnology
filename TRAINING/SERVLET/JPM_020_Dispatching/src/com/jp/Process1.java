package com.jp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * GET Method
 *  Query String : User entried passed through addresss bar when methos type is GET
 * 	Seperated by '?' from URI.
 * 	Seperated by '&' from another field
 * 	Prefer GET if data is small in size and not sensitive 
 * 
 * POST Method
 * Form DAta : User entries passed through seperate 
 * Form data is not exposed in addresss bar
 * 
 * Request.getParameter() : Bring every data in String
 * 		One Method to bring Query string or Form Data
 * 
 * 
 * Servlet implementation class Process1
 * The response if alter by this servlet does not reach to next in chain becuase the forward dispatching wipes off the old responses.
 * In the forward chain, the last entity to generate full and final resposne.
 */
@WebServlet("/process1")
public class Process1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	String param1 = request.getParameter("param1");
    	PrintWriter out = response.getWriter();
    	out.write("In the Servlet process1" + param1); // response

    	System.out.println("In the Servlet process 1" + param1);
    	RequestDispatcher dispatch = request.getRequestDispatcher("/process2");
    	dispatch.forward(request, response); // Send the control to another servlet/jsp
    	System.out.println("In the Servlet process1");
    	//out.flush(); // flush means commiting
    	
    }

}
