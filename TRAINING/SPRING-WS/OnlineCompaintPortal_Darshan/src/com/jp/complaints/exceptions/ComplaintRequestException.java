package com.jp.complaints.exceptions;

public class ComplaintRequestException extends Exception {

	private static final long serialVersionUID = 1L;

	public ComplaintRequestException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public ComplaintRequestException(String arg0) {
		super(arg0);

	}
	
	

}