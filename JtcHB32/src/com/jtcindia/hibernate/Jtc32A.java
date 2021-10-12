package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc32A {
	public static void main(String[] args) {
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Customer cust = (Customer)session.load(Customer.class, "4028e48879d2a5620179d2a59876000");
			System.out.println(cust.toString());
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
