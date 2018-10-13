package com.exception;

import com.util.ExceptionEnum;

public class UserExceptionFormEnum extends Exception{
	private static final long serialVersionUID = 1L;
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public UserExceptionFormEnum(String code) {
		super();
		this.code = code;
	}
	public UserExceptionFormEnum(ExceptionEnum exceptionEnum) {
		this.code = exceptionEnum.getCode();
	}
	
	public String getMsg() {
		String msg = ExceptionEnum.getMsg(code);
		return msg;
	}
	
}
