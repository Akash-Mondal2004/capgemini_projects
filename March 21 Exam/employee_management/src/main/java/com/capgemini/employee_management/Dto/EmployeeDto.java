package com.capgemini.employee_management.Dto;

import com.capgemini.employee_management.model.EmpType;

public class EmployeeDto {
	private String name;
	private String email;
	private String mobile;
	private EmpType role;
	private Double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public EmpType getRole() {
		return role;
	}
	public void setRole(EmpType role) {
		this.role = role;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
