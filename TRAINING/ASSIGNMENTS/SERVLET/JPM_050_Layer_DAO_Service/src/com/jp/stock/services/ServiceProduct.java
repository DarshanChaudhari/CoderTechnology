package com.jp.stock.services;

import java.util.ArrayList;

import com.jp.stock.entities.Products;
import com.jp.stock.exceptions.StockException;

public interface ServiceProduct {
	
	public ArrayList<Products> getProdList () throws StockException;
	

	public Products getProdDetails(int productId) throws StockException;
	
	public boolean insertNewProduct(Products product) throws StockException;
}
