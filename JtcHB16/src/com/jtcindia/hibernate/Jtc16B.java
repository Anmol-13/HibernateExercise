package com.jtcindia.hibernate;
import java.util.Collection;

import org.hibernate.*;

public class Jtc16B {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = (Customer)session.load(Customer.class, 1);
			System.out.println("**Customer Info**");
			System.out.println(cust.toString());
			System.out.println("**Requests info**");
			Collection<Request>col= cust.getRequests();
			for(Request req:col) {
				System.out.println(req);
			}
			tx.commit();
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
