package com.honsung.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honsung.dao.AuUserMapper;
import com.honsung.model.AuUser;
import com.honsung.service.AuUserService;


@Service
public class AuUserServiceImpl implements AuUserService{

	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AuUserMapper auUserMapper;
	
	public List<AuUser> list() {
		return auUserMapper.selectByExample(null);
	}

	public AuUser get(String id) {
		return auUserMapper.selectByPrimaryKey(id);
	}

	public AuUser login(AuUser user) {
		System.out.println(111111 +"user"+user.getLoginId());
		logger.info(user.getLoginId()+"登录成功！");
		logger.debug(user.getLoginId()+"登录成功！");
		logger.warn(user.getLoginId()+"登录成功！");
		logger.error(user.getLoginId()+"登录成功！");
		return auUserMapper.login(user);
	}

}
