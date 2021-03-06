package com.jp.hr.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoProduct;

@Service("productService")
@Transactional
public class ServiceProductImpl implements ServiceProduct {
	
	private DaoProduct daoProd;
	
	
	@Autowired
	public ServiceProductImpl(@Qualifier("daoProductDS") DaoProduct daoProd) {		
		this.daoProd = daoProd;
		System.out.println("Constructor of ServiceProductImpl : Calling the constructor based on @QualifierName- daoProduct");
	}

	
	public ServiceProductImpl() {
		
	}


	@Override
	public List<Product> getProdList() throws HrException {
		return daoProd.getProdList();
	}

	@Override
	public Product getProdDetails(int productId) throws HrException {
		// TODO Auto-generated method stub
		return daoProd.getProdDetails(productId);
	}

	@Override
	public boolean insertNewRecord(Product prod) throws HrException {
		// TODO Auto-generated method stub
		return daoProd.insertNewRecord(prod);
	}

}
