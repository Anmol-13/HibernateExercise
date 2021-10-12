package com.jtcindia.hibernate;
import org.hibernate.*;

public class Jtc13A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		try {
			
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("Som","Prakash","Som@jtc","9036");
			session.save(cust);
			Address add = new Address("Sec-2","Noida","UttarPradesh");
			session.save(add);
			cust.setAddress(add);
			tx.commit();
			System.out.println("record inserted");
			
			
		}catch(Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
		

	}

}
