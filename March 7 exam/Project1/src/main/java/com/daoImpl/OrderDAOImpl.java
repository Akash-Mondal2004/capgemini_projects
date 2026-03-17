package com.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.classes.Order;

public class OrderDAOImpl {

	private SessionFactory sessionFactory;
	
	public OrderDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void updateOrder(Order order) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.merge(order);
		
		transaction.commit();
		session.close();
	}
	
	public Order getOrderById(int id) {
		Session session = sessionFactory.openSession();
		
		Order order = session.get(Order.class, id);
		
		session.close();
		return order;
	}
	
}
