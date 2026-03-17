package com.capgemini.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("bean-config.xml");
        
        Student stu = (Student) context.getBean("student");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(stu.toString());
        System.out.println(emp.toString());
    }
}
