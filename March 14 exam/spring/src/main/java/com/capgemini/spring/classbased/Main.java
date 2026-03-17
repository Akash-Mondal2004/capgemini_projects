package com.capgemini.spring.classbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(BeanConfig.class);
		People people = context.getBean(People.class);
//		Bike bike = context.getBean(Bike.class);
		PojoClass pojoclass = context.getBean(PojoClass.class);
		
		System.out.println(people.toString());
//		System.out.println(bike.toString());
		System.out.println(pojoclass.toString());
	}
}
