package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exception.UserException;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value="getUser")
	public ModelAndView getUser(@RequestParam(name="id")Integer id) throws UserException {
		if(id==1) {
			throw new UserException("用户不正确");
		}else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("id", id);
			mv.setViewName("welcome");
			return mv;
		}
		
	}
}
