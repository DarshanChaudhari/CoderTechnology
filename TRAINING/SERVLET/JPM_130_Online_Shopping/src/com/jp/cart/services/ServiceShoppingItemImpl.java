package com.jp.cart.services;

import java.util.ArrayList;

import com.jp.cart.daos.DaoShoppingItem;
import com.jp.cart.daos.DaoShoppingItemImpl;
import com.jp.cart.entities.ShoppingItem;
import com.jp.cart.exceptions.CartException;


/* 	One layer refers to another layer through interface only.
 *	Implementation of the business rule should be done here in absence of BL layer.
 *	This layer will also ensures only custom exception to come out

Features of : 	
	*Only one gateway with preserving privacy of all inner classes.
	* One point for implementing security, transaction managemetn, caching.
	* Multiple interfaces per client to give restricted view of all services.
	* Facade pattern(GoF pattern - Gang of Four).
	* DAO is a JEE pattern.
	* Implemented singleton by creating single object of outermost class.
	* Delegates and controls Cross Cutting Concerns.
	
*/
public class ServiceShoppingItemImpl implements ServiceShoppingItem {	
	
	private DaoShoppingItem daoShoppingItem; // Here you have to create the reference of DAO Class and create a object of Implemented class.
	
	// Resolving Dependency.
	public ServiceShoppingItemImpl() throws CartException {		
		daoShoppingItem = new DaoShoppingItemImpl(); // As you have to create the reference of DAO Class and create a object of Implemented class.
	
	}

	
	@Override
	public ArrayList<ShoppingItem> getItemList() throws CartException {
		// TODO Auto-generated method stub
		return daoShoppingItem.getItemList();
	}


	
	@Override
	public ShoppingItem getItemDetails(String itemId) throws CartException {
		// TODO Auto-generated method stub
		return daoShoppingItem.getItemDetails(itemId);
	}
	
		

}