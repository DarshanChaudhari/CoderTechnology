package com.jp.stock.daos;

import java.util.ArrayList;

import com.jp.stock.entities.Products;
import com.jp.stock.exceptions.StockException;

public interface DaoProducts {
	
	public ArrayList<Products> getProdList() throws StockException;

}
