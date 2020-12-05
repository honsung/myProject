package com.honsung.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honsung.dao.Sys_UserMapper;
import com.honsung.model.Sys_User;
import com.honsung.service.Sys_UserService;

@Service
public class Sys_UserServiceImpl implements Sys_UserService {

	@Autowired
	private Sys_UserMapper sys_UserMapper;
	
	public List<Sys_User> list() {
		return sys_UserMapper.list();
	}

	public Sys_User get(String id) {
		return sys_UserMapper.get(id);
	}

	public Sys_User login(Sys_User user) {
		return sys_UserMapper.login(user);
	}

}
