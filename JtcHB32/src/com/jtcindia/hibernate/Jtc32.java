package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			
			Customer cust = new Customer("Som", "Som@gmail.com", 12345L);
			session.save(cust);
//			Customer cust1 = (Customer)session.load(Customer.class, "4028e48879d2d17c0179d2d17f7d0000");
//			System.out.println(cust1.toString());
			

			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
