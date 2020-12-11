package com.honsung.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/group")
public class GroupRelationController {

	protected Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list() {
		log.info("进来了");
		return "/sys/group/list";
	}
	
	@RequestMapping(value="/tree", method=RequestMethod.POST)
	public String tree() {
		return "tree";
	}
	
}