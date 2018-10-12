package com.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exception.UserExceptionFormEnum;
import com.exception.UserExceptionFormProperties;
import com.util.ExceptionEnum;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="getUser")
	public ModelAndView getUser(@RequestParam(name="id")Integer id) throws UserExceptionFormEnum, UserExceptionFormProperties, IOException {
		if(id==1) {
			throw new UserExceptionFormEnum(ExceptionEnum.UER_NOT_EXISTS);
		}else if(id==2){
			throw new UserExceptionFormProperties("user.not.have.power");
		}else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("id", id);
			mv.setViewName("welcome");
			return mv;
		}
		
	}
}
