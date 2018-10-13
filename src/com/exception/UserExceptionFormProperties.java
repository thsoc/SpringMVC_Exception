package com.exception;

import java.io.IOException;

import com.util.ExceptionUtils;

public class UserExceptionFormProperties extends Exception{
	private static final long serialVersionUID = 1L;
	private String code;
	
	public UserExceptionFormProperties(String code) throws IOException {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMsg() throws IOException {
		ExceptionUtils utils = new ExceptionUtils();
		return utils.getExceptionMsg(code);
	}
}
