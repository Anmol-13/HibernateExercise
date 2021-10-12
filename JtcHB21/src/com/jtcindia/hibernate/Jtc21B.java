package com.jtcindia.hibernate;

import org.hibernate.*;

public class Jtc21B {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = (Customer)session.load(Customer.class, 1);
			System.out.println(cust.toString());
			
			
			tx.commit();
			session.close();
			System.out.println("Record Updated");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}

}
