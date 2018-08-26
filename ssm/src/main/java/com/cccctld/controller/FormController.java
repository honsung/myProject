package com.cccctld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/form/layout")
	public String toFormLayout(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "form/form_layout";
	}
	@RequestMapping("/form/advance")
	public String toFormAdvance(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "form/form_advance";
	}
	@RequestMapping("/form/dynamicAdvance")
	public String toFormDynamicAdvance(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "form/form_dynamic_advance";
	}
	@RequestMapping("/form/component")
	public String toFormComponent(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "form/form_component";
	}
	@RequestMapping("/form/validation")
	public String toFormValidation(String menu,Model model){
		return "form/form_validation";
	}
	@RequestMapping("/form/multiple_file_upload")
	public String toMultipleFileUpload(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "form/form_fileupload";
	}
	@RequestMapping("/form/dropzone")
	public String toDropzone(String menu,Model model){
		model.addAttribute("menuId", menu);
		return "form/form_dropzone";
	}
}
