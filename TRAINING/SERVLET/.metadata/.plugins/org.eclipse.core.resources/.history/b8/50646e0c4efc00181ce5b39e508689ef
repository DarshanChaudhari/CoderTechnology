package com.jp.shopping.services;

import java.util.ArrayList;

import com.jp.shopping.daos.ItemMasterDAO;
import com.jp.shopping.daos.ItemMasterDAOImpl;
import com.jp.shopping.entities.ItemMaster;
import com.jp.shopping.exceptions.ShoppingException;

public class ItemMasterServiceImpl implements ItemMasterService {
	private ItemMasterDAO itemMasterDAO;
	
	
	public ItemMasterServiceImpl() throws ShoppingException {
		itemMasterDAO = new ItemMasterDAOImpl();
		
	}

	@Override
	public ArrayList<ItemMaster> getItemList() throws ShoppingException {
		
		return itemMasterDAO.getItemList();
	}

	@Override
	public ItemMaster getItemDetails(String itemId) throws ShoppingException {
		
		return null;
	}

}
