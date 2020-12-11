package com.honsung.service;

import java.util.List;

import com.honsung.model.User;

public interface UserService {

	public List<User> list();

	public User get(String id);

	public User login(User user);
}