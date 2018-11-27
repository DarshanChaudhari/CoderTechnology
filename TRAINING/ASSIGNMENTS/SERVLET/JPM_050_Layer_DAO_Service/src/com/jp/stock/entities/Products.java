package com.jp.stock.entities;

public class Products { 
	
	private int productId;
	private String productName;
	private String category;
	private float price;

	public Products() {
	
	}

		
	public Products(int productId, String productName, String category, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}


	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + "]";
	}
	

}
