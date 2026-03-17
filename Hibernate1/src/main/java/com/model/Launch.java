package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Launch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
//		Employee e = new Employee(1, "Ali", "ali@gmail.com", "9965840495");
//		s.save(e);
		
		Employee e1 = s.get(Employee.class, 1);
		System.out.println(e1);
		
		t.commit();
	}

}
