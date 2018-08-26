package com.cccctld.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cccctld.dao.AuEmployeeMapper;
import com.cccctld.model.AuEmployee;
import com.cccctld.model.AuEmployeeExample;
import com.cccctld.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public AuEmployeeMapper auEmployeeMapper;
	public List<AuEmployee> list(AuEmployeeExample example) {
		return auEmployeeMapper.list(example);
	}
}
