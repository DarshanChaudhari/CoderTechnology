package com.jp.shopping.services;

import java.util.ArrayList;

import com.jp.shopping.entities.ItemMaster;
import com.jp.shopping.exceptions.ShoppingException;

public interface ItemMasterService {
	
	public ArrayList<ItemMaster> getItemList() throws ShoppingException;
	
	public ItemMaster getItemDetails(String itemdId) throws ShoppingException;

}
