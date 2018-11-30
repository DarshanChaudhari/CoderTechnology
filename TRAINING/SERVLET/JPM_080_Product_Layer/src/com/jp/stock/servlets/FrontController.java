package com.jp.stock.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.stock.entities.Products;
import com.jp.stock.exceptions.StockException;
import com.jp.stock.services.ServiceProduct;
import com.jp.stock.services.ServiceProductImpl;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServiceProduct services;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = getCommand(request.getRequestURI());
//		System.out.println(command);
		RequestDispatcher dispatch = null;
		String jspName = null;
		String preFix = "/WEB-INF/jsps/";
		String postFix =".jsp";
		System.out.println(command);
		try {			

			switch (command) {
				case "*" :
				
				case "home" : {
					jspName="Home";
					break;
				}
				case "mainMenu" : {
					jspName="MainMenu";
					break;
				}
				
				case "login" : {
					jspName="Login";
					break;
				}
				
				case "authenticate" : {
					String userName = request.getParameter("username");
					String password = request.getParameter("password");
					
					if(userName.equalsIgnoreCase("darshan") && (password.equals("a"))) {
						String userFullName = userName;
						HttpSession session = request.getSession();
						session.setAttribute("userFullName", userFullName);
						jspName = "MainMenu";						
					} else {
						String errMessage = "Wrong credentials. Please enter again";
						request.setAttribute("message", errMessage);
						jspName= "Login";
					}
					
					break;
				}
				
				
				case "logout" :{
					HttpSession session = request.getSession();
					request.setAttribute("userFullName", session.getAttribute("userFullName"));
					session.invalidate();
					
					jspName="ThanksPage";
					break;
				}
				
				case "prodList" : {					
				ArrayList<Products> prodList = services.getProdList();				
				System.out.println(prodList);
				request.setAttribute("prodList", prodList);
				jspName = "prodList";
				break;				
				}
				
				case "newProduct" : {					
					jspName= "NewProduct";					
					break;
				}
				
								
				case "submitProduct" : {
					System.out.println("In Submit Product case");
					String prodIdStr= request.getParameter("productId");
					System.out.println(prodIdStr);
	 				String productName= request.getParameter("productName");
	 				System.out.println(productName);
	 				String category= request.getParameter("category");
	 				System.out.println(category);
	 				String priceStr= request.getParameter("price");
	 				System.out.println(priceStr);
	 				
					int productId = Integer.parseInt(prodIdStr);
					float price = Float.parseFloat(priceStr);
					Products product = new Products(productId,productName,category,price);					
					boolean isSucessfull = services.insertNewProduct(product);
					String msg = isSucessfull?"Employee Inserted.":"Insertion failed!";
					request.setAttribute("message", msg);
					jspName= "NewProduct";
					break;
				}
				
				
				case "prodDetails" : {
					String idStr = request.getParameter("id"); // empDetails.do?id=x this kind of url added in the anchor tag
					int productId = Integer.parseInt(idStr); // This empId i have to send to service layer
					Products product = services.getProdDetails(productId);
					request.setAttribute("prodDetails", product);
					jspName= "ProductDetails";
					System.out.println(jspName);
					break;
				}
			}
		} catch (StockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dispatch = request.getRequestDispatcher(preFix+jspName+postFix);
		dispatch.forward(request, response);
	
	}

	@Override
	public void init() throws ServletException {
		try {
			services = new ServiceProductImpl();// Create a object of Interface of ServiceEmployee Implementation
		} catch (StockException e) {
			throw new ServletException("Problem in init.",e);
		}  
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private String getCommand(String uri) {		
		
		int leftPos =uri.lastIndexOf("/");
		int rtPos = uri.lastIndexOf(".");
		if (rtPos<=leftPos) {
			return "home";
		}
		return uri.substring(leftPos+1, rtPos);		
	}
}