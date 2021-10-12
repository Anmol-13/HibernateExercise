package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Customer cust = new Customer("Som", "Som@gmail.com", 12345L);
			Integer it = (Integer)session.save(cust);
			System.out.println(it.intValue());
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
