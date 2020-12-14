package com.honsung.vo;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;


public class EmployeeVO implements Serializable {

	private static final long serialVersionUID = 5186576271133503258L;

	@NotBlank(message="{employee.name.notnull.error}")
	private String name;
	
	@Length(min=11,max=12,message="{employee.cellphone.length.error}")
	@NotBlank(message="{employee.cellphone.length.error}")
	private String cellphone;
}