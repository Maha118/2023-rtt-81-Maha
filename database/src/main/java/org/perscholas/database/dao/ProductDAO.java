package org.perscholas.database.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Product;


public class ProductDAO {
	public Product findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class
		
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("id", id);
		
Product result = query.getSingleResult();
		return result;
	}
	
	public List<Product> findByFirstName(String fname) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// Example of HQL to get all records of user class
		// SQL is : select * from customers c where c.contact_firstname = :firstname and c.contact_lastname = :lastname
		String hql = "FROM Customer c WHERE c.contactFirstname = :firstname"; 
		
		TypedQuery<Product> query = session.createQuery(hql, Product.class);
		query.setParameter("firstname",fname);
		
		List<Product> result = query.getResultList();
		return result;
	}
}
