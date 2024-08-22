package com.khanqah_Shahe_Razzaq.exception;

public class CustomeMessage {

	private String message;
	
	private boolean success=false;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public CustomeMessage(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

	public CustomeMessage() {
		
	}
	
	
}
