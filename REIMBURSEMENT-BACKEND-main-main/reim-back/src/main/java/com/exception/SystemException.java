package com.exception;

public class SystemException extends Exception {
	
	@Override
	public String getMessage() {
		return "Connection Failed! Please try Again!";
	}
	
	

}
