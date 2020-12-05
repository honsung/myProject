package com.honsung.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honsung.dao.AuEmployeeMapper;
import com.honsung.model.AuEmployee;
import com.honsung.model.AuEmployeeExample;
import com.honsung.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public AuEmployeeMapper auEmployeeMapper;
	public List<AuEmployee> list(AuEmployeeExample example) {
		return auEmployeeMapper.list(example);
	}
}
