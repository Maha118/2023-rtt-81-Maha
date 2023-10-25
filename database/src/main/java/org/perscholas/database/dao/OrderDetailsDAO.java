package org.perscholas.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.OrderDetails;


public class OrderDetailsDAO {

	public void save(OrderDetails orderDetail) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.saveOrUpdate(orderDetail);
		t.commit();
		session.close();
	}
	
}
