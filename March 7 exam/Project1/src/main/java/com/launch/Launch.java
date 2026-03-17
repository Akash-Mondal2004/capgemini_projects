package com.launch;

import java.time.LocalDate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.classes.Customer;
import com.classes.Order;
import com.daoImpl.CustomerDAOImpl;
import com.daoImpl.OrderDAOImpl;

public class Launch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Order.class);
		SessionFactory sf = cfg.buildSessionFactory();
		CustomerDAOImpl cdi = new CustomerDAOImpl(sf);
		OrderDAOImpl odi = new OrderDAOImpl(sf);
		
		Order o1 = new Order("HH443", "DELL Laptop", 2, 129581.54, LocalDate.of(2026, 1, 22));
		Order o2 = new Order("UB328", "LogiTech Mouse", 5, 1353.45, LocalDate.of(2025, 12, 31));
		
		Customer c1 = new Customer("Ali", "ali@gmail.com", "Male", 1949218049, LocalDate.of(2026, 1, 19), o1);
		Customer c2 = new Customer("Dia", "dia@gmail.com", "Female", 1248427298, LocalDate.of(2025, 11, 7), o2);
		
		cdi.insertCustomer(c1);
		cdi.insertCustomer(c2);
		
		for (Customer cs : cdi.getAllCustomers()) System.out.println(cs);
		System.out.println();
		
		Customer c = cdi.getCustomerById(c1.getId());
		
		c.setRegistrationDate(LocalDate.of(2026, 1, 26));
		c.setPhone(1934252443);
		cdi.updateCustomer(c);
		
		Order o = odi.getOrderById(o2.getId());
		o.setPrice(1446.34);
		o.setQuantity(6);
		odi.updateOrder(o);
		
		c = cdi.getCustomerByEmail("dia@gmail.com");
		System.out.println(c);
		System.out.println();
		
		cdi.deleteCustomer(c2.getId());
		
		for (Customer cs : cdi.getAllCustomers()) System.out.println(cs);
		System.out.println();
		
		sf.close();
	}

}
