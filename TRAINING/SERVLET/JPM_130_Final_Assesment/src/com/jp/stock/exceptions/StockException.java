package com.jp.stock.exceptions;

public class StockException extends Exception {

	
	public StockException(String message, Throwable cause) {
		super(message, cause);	
	}

	
	public StockException(Throwable cause) {
		super(cause);		
	}

}
