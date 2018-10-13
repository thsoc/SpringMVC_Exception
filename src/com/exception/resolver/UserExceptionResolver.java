package com.exception.resolver;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.exception.UserExceptionFormEnum;
import com.exception.UserExceptionFormProperties;
import com.util.ExceptionEnum;

/**
 * 或者直接在spring配置文件中注册bean
 * @author mzg
 *
 */
@Component
public class UserExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		String message = null;
		//1.解析异常类型
		if(ex instanceof UserExceptionFormEnum) {
			/*2.如果异常类型是系统自定义异常，
			直接取出异常信息，再错误页面展示*/
			message = ((UserExceptionFormEnum)ex).getMsg();
		}else if(ex instanceof UserExceptionFormProperties){
			try {
				message = ((UserExceptionFormProperties)ex).getMsg();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			/*3.如果异常类型不是系统自定义的异常，
			构造一个自定义的异常类型（信息位“未知错误”）*/
			message = "未知错误";
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.setViewName("error");
		return mv;
	}

}
