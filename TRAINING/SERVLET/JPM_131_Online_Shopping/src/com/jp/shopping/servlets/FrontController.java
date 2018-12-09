package com.jp.shopping.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jp.shopping.entities.ItemMaster;
import com.jp.shopping.exceptions.ShoppingException;
import com.jp.shopping.services.ItemMasterService;
import com.jp.shopping.services.ItemMasterServiceImpl;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ItemMasterService itemMasterService;
	//private OrderMasterService orderMasterService;
	


	public void init() throws ServletException {
		try {
			itemMasterService = new ItemMasterServiceImpl();
		} catch (ShoppingException e) {
			// TODO Auto-generated catch block
			throw new ServletException("Init Method failed.",e);
		} 
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatch = null;
		ArrayList<ItemMaster> itemList = new ArrayList<ItemMaster>();
		
		
		String command = getCommand(request.getRequestURI());
		
		
		
		String jspName = "";
		String prefix = "/WEB-INF/jsps/";
		String postfix = ".jsp";
		System.out.println(command);
		
		
		try {
			switch(command) {
			
				case "*" : 
				case "home" : {			
					jspName = "Home";
					break;					
				}
				
				case "itemList" : {
					
					itemList = itemMasterService.getItemList();					
					request.setAttribute("itemList", itemList);
					jspName = "ItemList";
					break;
				}
				
				case "addToCart" : {
					
				}
				
				case "itemDetails" : {
					String itemdId = request.getParameter("itemId");
					ItemMaster item = itemMasterService.getItemDetails(itemdId);
					System.out.println(item);
					request.setAttribute("itemDetails", item);
					jspName = "ItemDetails";
					break;
				}
				
			}
		} catch (ShoppingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		dispatch = request.getRequestDispatcher(prefix + jspName + postfix);
		dispatch.include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

	
	private String getCommand(String uri) {		
		
		int leftPos =uri.lastIndexOf("/");
		int rtPos = uri.lastIndexOf(".");
		System.out.println( rtPos + "," + leftPos );
		if (rtPos == -1 || leftPos == -1) {
			System.out.println("In true command");
			return "home";
		}
		return uri.substring(leftPos+1, rtPos);		
	}
}
