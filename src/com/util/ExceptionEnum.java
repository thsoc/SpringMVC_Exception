package com.util;

import org.apache.commons.lang.StringUtils;

public enum ExceptionEnum {
	UNKNOWN("UN001","未知错误！"),
	UER_NOT_EXISTS("U001","用户不存在！");
	
	private String code;
	private String message;
	private ExceptionEnum(String code, String message) {
		this.code = code;
		this.message = message;
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


	public static String getMsg(String code) {
		String msg = null;
		for (ExceptionEnum exceptionCode : ExceptionEnum.values()) {
			if(StringUtils.equals(code, exceptionCode.getCode())) {
				msg = exceptionCode.getMessage();
			}
		}
		if(StringUtils.isEmpty(msg)) {
			msg = "未知错误！";
		}
		return msg;
	}
	
}
