package com.honsung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.honsung.service.AuUserService;

@Controller("/auUser")
public class AuUserController {

	@Autowired
	private AuUserService auUserService;
	
}
