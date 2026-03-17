package com.capgemini.spring.classbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PojoClass {

	@Autowired
	private Bike bike;
	
	@Autowired
	private People people;

	@Override
	public String toString() {
		return "PojoClass [bike=" + bike + ", people=" + people + "]";
	}
	
	
}
