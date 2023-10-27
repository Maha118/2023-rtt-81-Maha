package org.perscholas.database.dao;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetails;


public class OrderDetailsDAO {
	
	
public OrderDetails findByOrderIdAndProductId(Integer orderId, Integer productId) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	String hql = "FROM OrderDetail od WHERE od.order.id = :orderId and od.product.id = :productId"; // Example of HQL to get all records of user class

	TypedQuery<OrderDetails> query = session.createQuery(hql, OrderDetails.class);
	query.setParameter("orderId", orderId);
	query.setParameter("productId", productId);

	try {
		OrderDetails result = query.getSingleResult();
		
		return result;
	} catch (NoResultException nre) {
		return null;
	}
}


public void save(OrderDetails orderDetail) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();

	Transaction t = session.beginTransaction();
	session.saveOrUpdate(orderDetail);
	t.commit();
	session.close();
}
}
