package com.jp.hr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name="prodRec")
@Table(name="PRODUCT")
public class Product {
	
	private int productId;
	
	
	@NotNull
	@Size(min = 3, max = 20, message="First Name not meeting size constraints.")
	@Pattern(regexp = "[a-z-A-Z]*", message = "First Name has invalid characters")
	private String productName;
	
	@NotNull
	@Size(min = 3, max = 20, message="Last Name not meeting size constraints.")
	@Pattern(regexp = "[a-z-A-Z]*", message = "Last Name has invalid characters")
	private String category;
	private float price;
	
	public Product(int productId, String productName, String category, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="PRODUCT_ID")
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	@Column(name="NAME")
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Column(name="CATEGORY")
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Column(name="PRICE")
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
}
