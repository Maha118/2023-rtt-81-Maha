package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.perscholas.database.entity.Orderdetail;

public class OrderDetailDAO {
	public Orderdetail findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class
		
		TypedQuery<Orderdetail> query = session.createQuery(hql, Orderdetail.class);
		query.setParameter("id", id);
		
		Orderdetail result = query.getSingleResult();
		return result;
	}
	
	public List<Orderdetail> findByFirstName(String fname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Example of HQL to get all records of user class
		// SQL is : select * from customers c where c.contact_firstname = :firstname and c.contact_lastname = :lastname
		String hql = "FROM Customer c WHERE c.contactFirstname = :firstname"; 
		
		TypedQuery<Orderdetail> query = session.createQuery(hql, Orderdetail.class);
		query.setParameter("firstname",fname);
		
		List<Orderdetail> result = query.getResultList();
		return result;
	}

}
