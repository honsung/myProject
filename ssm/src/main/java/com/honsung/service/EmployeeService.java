package com.honsung.service;

import java.util.List;

import com.honsung.model.Employee;
import com.honsung.model.EmployeeExample;

public interface EmployeeService {

	public List<Employee> list(EmployeeExample example);
}