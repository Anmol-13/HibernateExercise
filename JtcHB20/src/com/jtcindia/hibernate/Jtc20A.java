package com.jtcindia.hibernate;

import org.hibernate.*;

public class Jtc20A {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("Prakash", "Prakash@jtcindia,org", 56886565L);
			session.save(cust);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}

}
