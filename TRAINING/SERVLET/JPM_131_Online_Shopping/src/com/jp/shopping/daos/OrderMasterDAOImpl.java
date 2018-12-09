package com.jp.shopping.daos;

import java.util.ArrayList;

import com.jp.shopping.entities.OrderMaster;
import com.jp.shopping.exceptions.ShoppingException;

public class OrderMasterDAOImpl implements OrderMasterDAO {

	public OrderMasterDAOImpl() {
		
	}

	@Override
	public ArrayList<OrderMaster> getOrderList() throws ShoppingException {
		
		return null;
	}

	@Override
	public boolean insertOrderDetails(ArrayList<OrderMaster> orderList) throws ShoppingException {
		
		return false;
	}

}
