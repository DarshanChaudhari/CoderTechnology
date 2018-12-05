package com.jp.cart.entities;

public class PlaceOrder {

	private int customerId;
	private int orderId;
	private String itemId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public PlaceOrder(int customerId, int orderId, String itemId) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.itemId = itemId;
	}
	@Override
	public String toString() {
		return "PlaceOrder [customerId=" + customerId + ", orderId=" + orderId + ", itemId=" + itemId + "]";
	}
	public PlaceOrder(int customerId, String itemId) {
		super();
		this.customerId = customerId;
		this.itemId = itemId;
	}
	
	

	
}