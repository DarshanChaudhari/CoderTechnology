package com.jp.cart.daos;

import java.util.ArrayList;

import com.jp.cart.entities.ShoppingItem;
import com.jp.cart.exceptions.CartException;

public interface DaoShoppingItem {
	
	public ArrayList<ShoppingItem> getItemList () throws CartException;
	
	public ShoppingItem getItemDetails(String itemId) throws CartException;

	
		
}
