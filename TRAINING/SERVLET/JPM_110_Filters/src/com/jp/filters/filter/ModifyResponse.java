package com.jp.filters.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, servletNames = { "Servlet1" }, urlPatterns={"*.do"}) // urlPatterns={"/servlet1","/servlet2"}) -- Initially it was now i have change to (*.do)
public class ModifyResponse implements Filter {
		

  	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {		
		// 
		System.out.println("Before part of filter-MR");
		RequestDispatcher dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Header.jsp");
		dispatch.include(request, response);
		chain.doFilter(request, response);
		System.out.println("After part of filter-MR");		
		// After part
		dispatch = request.getRequestDispatcher("/WEB-INF/jsps/Footer.jsp");
		dispatch.include(request, response);
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// Life cycle method for filter to do initialization.
		System.out.println("In Init() of Filter-MR");
	}
	
	public void destroy() {
		System.out.println("In Destroy() of Filter-MR");
	}

}
