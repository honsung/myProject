package com.sys.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys_Menu")
public class MenuController {

	@RequestMapping("/main")
	public String toTableManaged(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "sys/menu/menuMain";
	}
}
