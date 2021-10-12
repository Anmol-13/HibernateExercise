package com.jtcindia.hibernate;
import org.hibernate.*;

public class Jtc15A {
	public static void main(String[] arg) {
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("Prakash", "rai", "Prakash@jtc.com", 9999L);
			session.save(cust);
			Request req1 = new Request("22/07/2021", "hello1","ok1");
			Request req2 = new Request("22/07/2021", "hello2","ok2");
			session.save(req1);
			session.save(req2);
			req1.setCustomer(cust);
			req2.setCustomer(cust);
			tx.commit();
			session.close();
			System.out.println("Recorded Inserted");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}

}
