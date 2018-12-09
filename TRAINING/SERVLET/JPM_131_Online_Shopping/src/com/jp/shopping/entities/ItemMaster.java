package com.jp.shopping.entities;

public class ItemMaster {
	private String itemId;
	private String name;
	private String category;
	private Float price;
	private Integer itemStock;
	
	public ItemMaster(String itemId, String name, String category, Float price, Integer itemStock) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.category = category;
		this.price = price;
		this.itemStock = itemStock;
	}

	public ItemMaster() {
		// TODO Auto-generated constructor stub
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getItemStock() {
		return itemStock;
	}

	public void setItemStock(Integer itemStock) {
		this.itemStock = itemStock;
	}

	@Override
	public String toString() {
		return "OrderMaster [itemId=" + itemId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", itemStock=" + itemStock + "]";
	}
	
	
	
}
