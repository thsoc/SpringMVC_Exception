package com.exception;

import com.util.ExceptionEnum;

public class UserExceptionFormEnum extends Exception{
	private static final long serialVersionUID = 1L;
	private String code;
	private String message;
	public UserExceptionFormEnum(ExceptionEnum exceptionEnum) {
		this.code = exceptionEnum.getCode();
		this.message = exceptionEnum.getMessage();
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
