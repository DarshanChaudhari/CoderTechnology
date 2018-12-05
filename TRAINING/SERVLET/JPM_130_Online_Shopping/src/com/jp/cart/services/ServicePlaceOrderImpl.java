package com.jp.cart.services;

import com.jp.cart.daos.DaoPlaceOrder;
import com.jp.cart.daos.DaoPlaceOrderImpl;
import com.jp.cart.entities.PlaceOrder;
import com.jp.cart.exceptions.CartException;

public class ServicePlaceOrderImpl implements ServicePlaceOrder{
	
	private DaoPlaceOrder daoPlaceOrder;
	
	
	
	public ServicePlaceOrderImpl() throws CartException {
		
		daoPlaceOrder = new DaoPlaceOrderImpl();
	}



	@Override
	public boolean AddNewOrder(PlaceOrder pOrder) throws CartException {
		// TODO Auto-generated method stub
		return daoPlaceOrder.AddNewOrder(pOrder);
	}

}