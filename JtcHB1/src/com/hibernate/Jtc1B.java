package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc1B {public static void main(String args[]) {
	Transaction tx = null;
	try {
		SessionFactory sf = CHibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();

		Customer cust = (Customer) session.load(Customer.class, 1);
		System.out.println(cust.getCid() + "\t" + cust.getCname() + "\t" + cust.getEmail() + "\t" + cust.getCity()
				+ "\t" + cust.getPhone() + "\t" + cust.getBal());
		tx.commit();
	} catch (Exception e) {
		e.printStackTrace();
		if (tx != null)
			tx.rollback();
	}
}

}