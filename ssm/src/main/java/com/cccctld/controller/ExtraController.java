package com.cccctld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExtraController {

	@RequestMapping("extra/extra_500_option1")
	public String extra_500_option1(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "extra/500_option1";
	}
	@RequestMapping("extra/extra_404_option1")
	public String extra_404_option1(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "extra/404_option1";
	}
}
