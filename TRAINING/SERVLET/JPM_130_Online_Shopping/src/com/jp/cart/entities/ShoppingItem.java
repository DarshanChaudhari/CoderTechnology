package com.jp.cart.entities;

public class ShoppingItem {
	
	private String itemId;
	private String itemName;
	private String category;
	private double price;
	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", price=" + price
				+ "]";
	}


	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public ShoppingItem(String itemId, String itemName, String category, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.price = price;
	}



}