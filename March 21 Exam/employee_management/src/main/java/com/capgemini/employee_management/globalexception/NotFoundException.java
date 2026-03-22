package com.capgemini.employee_management.globalexception;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String msg) {
		super(msg);
	}
}