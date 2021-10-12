package com.jtcindia.hibernate;

import org.hibernate.*;
import java.sql.Timestamp;

public class Jtc22A {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
			Customer cust = new Customer("Prakash", "Prakash@jtcindia,org", 123456L, timestamp1);
//			new Customer("Prakash", "Prakash@jtcindia,org", 56886565L);
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
