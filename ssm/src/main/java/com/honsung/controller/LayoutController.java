package com.honsung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {

	@RequestMapping("/layout/blank")
	public String layoutBlank(String menu,Model model){
		model.addAttribute("menuId", menu);
		return  "layouts/layout_blank";
	}
	
	@RequestMapping("/layout/modals")
	public String layoutModals(String menu,Model model){
		model.addAttribute("menuId", menu);
		return  "layouts/layout_modals";
	}
}
