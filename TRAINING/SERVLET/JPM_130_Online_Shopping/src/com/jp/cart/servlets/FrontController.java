package com.jp.cart.servlets;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.cart.daos.DaoPlaceOrderImpl;
import com.jp.cart.entities.PlaceOrder;
import com.jp.cart.entities.ShoppingItem;
import com.jp.cart.exceptions.CartException;
import com.jp.cart.services.ServicePlaceOrder;
import com.jp.cart.services.ServicePlaceOrderImpl;
import com.jp.cart.services.ServiceShoppingItem;
import com.jp.cart.services.ServiceShoppingItemImpl;


/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")		// Generic url [.do is the filteration]
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServiceShoppingItem services; // Create a reference of Interface
	private ServicePlaceOrderImpl services1;

	/*
	 	* Front Controller : A JEE design pattern.
		* Command pattern (GoF pattern).
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = getCommand(request.getRequestURI());
		RequestDispatcher dispatch = null;
		String jspName = null;
		String preFix = "/WEB-INF/jsps/";
		String postFix =".jsp";
		try {
			switch(command) {		
				
				case "*" : 
				
				case "mainMenu" :{
					String userFullName = "John Wilson";
					HttpSession session = request.getSession();
					session.setAttribute("userFullName", userFullName);
					jspName="MainMenu";
					break;
				}
				case "itemList" :{
					ArrayList<ShoppingItem> itemList = services.getItemList();
					System.out.println("In Item list");
					System.out.println(itemList);			
					request.setAttribute("itemList", itemList);
					jspName= "ItemList";					
					break;
				}
				
				case "itemDetails" : {
					System.out.println("In Item Details");
					String itemId = request.getParameter("id"); 
					System.out.println(itemId);					
					ShoppingItem itemDetails = services.getItemDetails(itemId);
					System.out.println(itemDetails);
					request.setAttribute("ItemDetails", itemDetails);
					jspName= "ItemDetails";					
					break;
				}
				
				case "cart" : {					
					String itemId = request.getParameter("id");							
					ShoppingItem itemDetails = services.getItemDetails(itemId);					
					request.setAttribute("ItemDetails", itemDetails);
					jspName= "CartDetails";					
					break;
				}

				case "placeOrder" : {
					
					String itemId= request.getParameter("id");									
					int customerId= 12345;										
					PlaceOrder pc = new PlaceOrder(customerId,itemId);
					boolean isSucessfull = services1.AddNewOrder(pc);
					String msg = isSucessfull?"Order placed sucessfully.":"Order is not able to placed!";
					request.setAttribute("message", msg);
					jspName= "ThanksPage";
					break;
				}
				
				case "logout" :{
					HttpSession session = request.getSession();
					request.setAttribute("userFullName", session.getAttribute("userFullName"));
					session.invalidate();
					
					jspName="ThanksPage";
					break;
				}
			}
		} catch (CartException e) {			
			e.printStackTrace();
		}
		 	
		dispatch = request.getRequestDispatcher(preFix + jspName + postFix);
		dispatch.forward(request, response);
		
	}	


		
		@Override
	public void init() throws ServletException {
		try {
			services = new ServiceShoppingItemImpl();
			services1 = new ServicePlaceOrderImpl();
		} catch (CartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException("Init method failed.",e);
		}  // Create a object of Interface of ServiceEmployee Implementation
		
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
		
		
	private String getCommand(String uri) {
		
		
		int leftPos =uri.lastIndexOf("/");
		int rtPos = uri.lastIndexOf(".");
		if (rtPos<=leftPos) {
			return "mainMenu";
		}
		return uri.substring(leftPos+1, rtPos);		
	}
}