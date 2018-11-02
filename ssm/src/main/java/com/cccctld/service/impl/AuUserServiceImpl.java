package com.cccctld.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cccctld.dao.AuUserMapper;
import com.cccctld.model.AuUser;
import com.cccctld.service.AuUserService;


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
		logger.info(user.getLoginId()+"登录成功！");
		return auUserMapper.login(user);
	}

}