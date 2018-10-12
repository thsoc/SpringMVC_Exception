package com.exception;

import java.io.IOException;

import com.util.ExceptionUtils;

public class UserExceptionFormProperties extends Exception{
	private static final long serialVersionUID = 1L;
	private String code;
	private String message;
	
	public UserExceptionFormProperties(String code) throws IOException {
		super();
		this.code = code;
		ExceptionUtils exceptionUtils = new ExceptionUtils();
		message = exceptionUtils.getExceptionMsg(code);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
