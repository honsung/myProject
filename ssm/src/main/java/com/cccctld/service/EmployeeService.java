package com.cccctld.service;

import java.util.List;

import com.cccctld.model.AuEmployee;
import com.cccctld.model.AuEmployeeExample;

public interface EmployeeService {

	public List<AuEmployee> list(AuEmployeeExample example);
}