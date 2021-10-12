package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc35A {
	public static void main(String[] args) {
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			SID id = SIDGenerator.getNextSid("30");
			Student stu = new Student(id,"som","som@gmail.com","99999");
			session.save(stu);
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
