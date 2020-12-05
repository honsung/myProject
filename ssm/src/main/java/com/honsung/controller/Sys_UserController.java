package com.honsung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.honsung.model.Sys_User;
import com.honsung.service.Sys_UserService;

@Controller
@RequestMapping("/sys_User")
public class Sys_UserController {

	/*@Autowired
	private Sys_UserService sys_UserService;
	
	@RequestMapping(value="/list")
	public String list(String menu,Model model){
		List<Sys_User> list = sys_UserService.list();
		model.addAttribute("users", list);
		model.addAttribute("menuId", menu);
		return "/sys/list_Sys_User";
	}*/
}
