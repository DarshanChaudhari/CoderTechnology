package com.jp.cart.daos;

import com.jp.cart.entities.PlaceOrder;
import com.jp.cart.exceptions.CartException;

public interface DaoPlaceOrder {
	
	public boolean AddNewOrder(PlaceOrder pOrder) throws CartException;
	
	

}