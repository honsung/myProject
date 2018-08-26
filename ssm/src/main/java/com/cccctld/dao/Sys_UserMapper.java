package com.cccctld.dao;

import java.util.List;


import com.cccctld.model.Sys_User;


public interface Sys_UserMapper {

	public List<Sys_User> list();
	
	public Sys_User get(String id);
	
	public Sys_User login(Sys_User user);
}
