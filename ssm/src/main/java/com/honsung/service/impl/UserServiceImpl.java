package com.honsung.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.honsung.dao.UserMapper;
import com.honsung.model.User;
import com.honsung.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	protected Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> list() {
		return userMapper.selectByExample(null);
	}

	@Override
	public User get(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User login(User user) {
		log.info(user.toString());
		log.info(user.getLoginId()+"登录成功！");
		log.debug(user.getLoginId()+"登录成功！");
		log.warn(user.getLoginId()+"登录成功！");
		log.error(user.getLoginId()+"登录成功！");
		return userMapper.login(user);
	}
}
