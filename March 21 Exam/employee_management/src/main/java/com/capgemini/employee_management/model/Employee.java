package com.capgemini.employee_management.model;

import jakarta.persistence.*;

@Entity
@Table(name="employeeManagement")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String mobile;
	@Enumerated(EnumType.STRING)
	private EmpType role;
	@Column
	private double salary;
	
	@Column
	private String password; 

	public Employee(Integer id, String name, String email, String mobile, EmpType role, double salary,String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.role = role;
		this.salary = salary;
		this.password = password;
	}

	public Employee() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", role=" + role
				+ ", salary=" + salary + "]";
	}
	
	
	
}
