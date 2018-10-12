package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.util.StringUtils;




public class ExceptionUtils {
	// 属性集合对象
	private Properties prop;
	// 属性文件输入流
	private InputStream fis;
	private void init() throws IOException {
		prop = new Properties();
		fis = this.getClass().getResourceAsStream("/exception/exceptionMapping.properties");
		prop.load(fis);
		fis.close();
	}
	public String getExceptionMsg(String Exception) throws IOException {
		init();
		String msg = prop.getProperty(Exception);
		if(!StringUtils.isEmpty(msg)) {
			return msg;
		}else {
			return "未定义错误！";
		}
	}
}
