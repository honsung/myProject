package com.cccctld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.cccctld.model.AuEmployee;
import com.cccctld.model.AuEmployeeExample;
import com.cccctld.service.EmployeeService;
import com.github.pagehelper.PageInfo;

/**
 * 员工管理控制层
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * 
	 * @param pageNo   页码
	 * @param pageSize  页码数据条数
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list")
	public String list(@RequestParam(value="pageNo",defaultValue="1")Integer pageNo,@RequestParam(value="pageSize",defaultValue="10")Integer pageSize,AuEmployeeExample example, Model model){
		PageHelper.startPage(1, 10);
		List<AuEmployee> list = employeeService.list(example);
		PageInfo page = new PageInfo(list,10);
		model.addAttribute("pageInfo", page);
		return "sys/employee/listEmployee";
	}
}
