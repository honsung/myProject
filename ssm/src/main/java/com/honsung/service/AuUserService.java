package com.honsung.service;

import java.util.List;

import com.honsung.model.AuUser;


public interface AuUserService {
	
	public List<AuUser> list();

	public AuUser get(String id);

	public AuUser login(AuUser user);
}
