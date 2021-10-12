package com.hibernate;

import org.hibernate.*;

public class Jtc1A {
	public static void main(String args[]) {
		Transaction tx = null;
		try {
			SessionFactory sf = CHibernateUtil.getSessionFactory();
			Session session = sf.openSession();

			tx = session.beginTransaction();

			Customer cust = new Customer(2, "roh", "roh@jtc.com", "Del", 456, 654);
			session.save(cust);

			tx.commit();
			session.close();

			System.out.println("record inserted");
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
	}

}
