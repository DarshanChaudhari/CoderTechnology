package com.jp.stock.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jp.stock.entities.Products;
import com.jp.stock.exceptions.StockException;
import com.jp.stock.services.ServiceProduct;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServiceProduct services;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = getCommand(request.getRequestURI());
		System.out.println(command);
		
		try {
			switch (command) {
				case "prodList" : {
				ArrayList<Products> prodList = services.getProdList();
				System.out.println(prodList);
				}
			}
		} catch (StockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	private String getCommand(String uri) {
		
		int leftPos = uri.lastIndexOf("/");
		int rtPos = uri.lastIndexOf(".");
		
		return uri.substring(leftPos+1, rtPos);
		
	}
}
