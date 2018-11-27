package com.jp.stock.services;
import java.util.ArrayList;

import com.jp.stock.daos.DaoProducts;
import com.jp.stock.daos.DaoProductsImpl;
import com.jp.stock.entities.Products;
import com.jp.stock.exceptions.StockException;

public class ServiceProductImpl implements ServiceProduct {

	private DaoProducts daoProd;
	
	
	
	public ServiceProductImpl() {
		daoProd = new DaoProductsImpl();
	}



	@Override
	public ArrayList<Products> getProdList() throws StockException {
		// TODO Auto-generated method stub
		return daoProd.getProdList();
	}

}
