package com.cccctld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cccctld.service.AuUserService;

@Controller("/auUser")
public class AuUserController {

	@Autowired
	private AuUserService auUserService;
	
}
