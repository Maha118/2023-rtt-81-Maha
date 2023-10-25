package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class OrderDAO {
	public Order findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class
		
		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("id", id);
		
		Order result = query.getSingleResult();
		return result;
	}
	
	public List<Order> findByFirstName(String fname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Example of HQL to get all records of user class
		// SQL is : select * from customers c where c.contact_firstname = :firstname and c.contact_lastname = :lastname
		String hql = "FROM Customer c WHERE c.contactFirstname = :firstname"; 
		
		TypedQuery<Order> query = session.createQuery(hql, Order.class);
		query.setParameter("firstname",fname);
		
		List<Order> result = query.getResultList();
		return result;
	}
	public void save(Customer save) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		session.saveOrUpdate(save);
		t.commit();
	}
}
