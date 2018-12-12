package com.jp.hr.client;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceProduct;

public class TestProductService {

	public static void main(String[] args) {
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
			ServiceProduct prodService = (ServiceProduct) ctx.getBean("service");			
			//ServiceEmployee empService1 = new ServiceEmployeeImpl();
			ArrayList<Product> prodList = prodService.getProdList();
			
			for (Product prod : prodList) {
				System.out.println(prod);
			}
		} catch (HrException e) {
			e.printStackTrace();
		}

	}

}
