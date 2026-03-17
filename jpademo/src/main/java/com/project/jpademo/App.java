package com.project.jpademo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	et.begin();
    	
    	Employee e1 = new Employee( "Kakali", "kakali@gmail.com", "1");
    	Employee e2 = new Employee( "Ankur", "ankur@gmail.com", "0984352234");
    	Employee e3 = new Employee( "Srijan", "srijan@gmail.com", "05892459");

	      em.persist(e1);
	      em.persist(e2);
	      em.persist(e3);
    	
    	
    	
    	
    	et.commit();
    	em.close();
    	emf.close();
    }
}
