package com.jp.shopping.daos;

import java.util.ArrayList;

import com.jp.shopping.entities.ItemMaster;
import com.jp.shopping.exceptions.ShoppingException;

public interface ItemMasterDAO {

	public ArrayList<ItemMaster> getItemList() throws ShoppingException;
	
	public ItemMaster getItemDetails(String itemId) throws ShoppingException;
}
