package com.jp;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ServletLifeCycle
 */
@WebServlet("/lifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLifeCycle() {
       System.out.println("In the Constructor");
    }
    
//    public init(SystemConfig config) {
//    	
//    }
//    
//   public init() {
//    	
//    }

}
