package com.honsung.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.honsung.model.User;
import com.honsung.service.UserService;

@Controller
public class LoginController {

	protected Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/tologin")
	public String toLogin(){
		return "login/login";
	}
	
	/*@RequestMapping(value="/login", method=RequestMethod.POST)
	public String Login(Sys_User user,HttpSession session){
		Sys_User returnUser = sys_UserService.login(user);
		session.setAttribute("CurrentLoginUser", returnUser);
		String returnPath = "index";
		if(returnUser == null){
			returnPath = "login/login";
		}
		return returnPath;
	}*/
	
	@RequestMapping(value="/loginGap", method=RequestMethod.POST)
	public String Login(User user,HttpSession session){
		User returnUser = userService.login(user);
		session.setAttribute("currentLoginUser", returnUser);
		String returnPath = "index";
		if(returnUser == null){
			returnPath = "login/login";
		}
		System.out.println(returnUser.getName());
		return returnPath;
	}
	
	@RequestMapping("/index")
	public String index(HttpSession session){
		if(null==session.getAttribute("CurrentLoginUser")){
			return "login/login";
		}else{
			return "index";
		}
	}
}