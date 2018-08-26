package com.cccctld.service;

import java.util.List;

import com.cccctld.model.AuUser;


public interface AuUserService {
	
	public List<AuUser> list();

	public AuUser get(String id);

	public AuUser login(AuUser user);
}
