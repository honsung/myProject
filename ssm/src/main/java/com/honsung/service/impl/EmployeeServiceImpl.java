package com.honsung.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honsung.dao.EmployeeMapper;
import com.honsung.model.Employee;
import com.honsung.model.EmployeeExample;
import com.honsung.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeMapper employeeMapper;
	public List<Employee> list(EmployeeExample example) {
		return employeeMapper.list(example);
	}
}