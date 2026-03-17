package com.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.classes.Customer;

public class CustomerDAOImpl {
	private SessionFactory sessionFactory;
	
	public CustomerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void insertCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(customer);
		
		transaction.commit();
		session.close();
	}
	
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.merge(customer);
		
		transaction.commit();
		session.close();
	}
	
	public Customer deleteCustomer(int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = session.get(Customer.class, id);
		if (customer!=null) session.remove(customer);
		
		transaction.commit();
		session.close();
		return customer;
	}
	
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.openSession();
		
		Customer customer = session.get(Customer.class, id);
		
		session.close();
		return customer;
	}
	
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.openSession();
		
		Query<Customer> query = session.createQuery("FROM Customer", Customer.class);
		List<Customer> customers = query.getResultList();
		
		session.close();
		return customers;
	}
	
	// JPQL Query
	public Customer getCustomerByEmail(String email) {
		Session session = sessionFactory.openSession();
		
		Query<Customer> query = session.createQuery("FROM Customer c WHERE c.email = :email", Customer.class);
		query.setParameter("email", email);
		Customer customer = query.uniqueResult();
		
		session.close();
		return customer;
	}
	
}
