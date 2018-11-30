package com.jp.filters.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class ManagePageSize
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "*.do" })
public class ManagePageSize implements Filter {

  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Before part of filter-MP");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("After part of filter-MP");
	}


	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("In Init of Filter-MP");		
	}
	
	  
	public void destroy() {
		System.out.println("In destroy of Filter-MP");
	}

}
