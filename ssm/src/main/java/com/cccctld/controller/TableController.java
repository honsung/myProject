package com.cccctld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {
	@RequestMapping("/table/basic")
	public String toTableBasic(String menu,Model model){
		System.out.println(menu);
		model.addAttribute("menuId", menu);
		return "table/basic";
	}
	
	@RequestMapping("/table/responsive")
	public String toTableResponsive(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "table/table_responsive";
	}
	
	@RequestMapping("/table/managed")
	public String toTableManaged(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "table/table_managed";
	}
	
	@RequestMapping("/table/editable")
	public String toTableEditable(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "table/table_editable";
	}
	
	@RequestMapping("/table/advanced")
	public String toTableAdvanced(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "table/table_advanced";
	}
}
