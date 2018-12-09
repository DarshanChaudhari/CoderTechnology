package com.jp.shopping.entities;

public class OrderMaster {
	
	private Integer customerId;
	private Integer orderId;
	private String itemId;
	
	public OrderMaster(Integer customerId, Integer orderId, String itemId) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.itemId = itemId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "OrderMaster [customerId=" + customerId + ", orderId=" + orderId + ", itemId=" + itemId + "]";
	}
	
	
	
	

}
