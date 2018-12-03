package com.jp.cart.services;

import com.jp.cart.entities.PlaceOrder;
import com.jp.cart.exceptions.CartException;

public interface ServicePlaceOrder {

	public boolean AddNewOrder(PlaceOrder pOrder) throws CartException;
}
