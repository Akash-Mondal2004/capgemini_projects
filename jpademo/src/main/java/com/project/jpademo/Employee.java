package com.project.jpademo;

import jakarta.persistence.*;


@Entity
@Table(name = "Emp")
public class Employee {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name ="id")
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column(unique = true)
	private String mobile;
	public Employee( String name, String email, String mobile) {
		super();
//		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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


	public Employee() {
		
	}
}
