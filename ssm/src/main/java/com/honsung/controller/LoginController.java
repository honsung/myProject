package com.honsung.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.honsung.model.AuUser;
import com.honsung.model.Sys_User;
import com.honsung.service.AuUserService;
import com.honsung.service.Sys_UserService;

@Controller
public class LoginController {

	/*@Autowired
	private Sys_UserService sys_UserService;
	*/
	@Autowired
	private AuUserService auUserService;
	
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
	public String Login(AuUser user,HttpSession session){
		AuUser returnUser = auUserService.login(user);
		System.out.println(returnUser.getName());
		session.setAttribute("currentLoginUser", returnUser);
		String returnPath = "index";
		if(returnUser == null){
			returnPath = "login/login";
		}
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
