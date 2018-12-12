package com.jp.hr.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoProduct;

@Service("service")
public class ServiceProductImpl implements ServiceProduct {

	private DaoProduct daoProd;
	
	
	@Autowired
	public ServiceProductImpl(DaoProduct daoProd) {		
		this.daoProd = daoProd;
		System.out.println("Constructor of ServiceProductImpl : Calling the constructor based on @QualifierName- dao");
	}

	
	public ServiceProductImpl() {
		
	}


	@Override
	public ArrayList<Product> getProdList() throws HrException {
		return daoProd.getProdList();
	}

	@Override
	public Product getProdDetails(int prodId) throws HrException {
		// TODO Auto-generated method stub
		return daoProd.getProdDetails(prodId);
	}

	@Override
	public boolean insertNewRecord(Product prod) throws HrException {
		// TODO Auto-generated method stub
		return daoProd.insertNewRecord(prod);
	}

}
