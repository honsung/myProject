package com.honsung.service;

import java.util.List;

import com.honsung.model.AuEmployee;
import com.honsung.model.AuEmployeeExample;

public interface EmployeeService {

	public List<AuEmployee> list(AuEmployeeExample example);
}