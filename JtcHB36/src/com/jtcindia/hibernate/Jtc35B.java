package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc35B {
	public static void main(String[] args) {
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			Object obj = session.get(Student.class, new SID("30","001"));
			if (obj == null) {
				System.out.println("Student Not Found");
				
			} else {
				Student stu1 = (Student)obj;
				System.out.println(stu1.getStudentid().getBid());
				System.out.println(stu1.getStudentid().getSid());
				System.out.println(stu1.getSname());
				System.out.println(stu1.getEmail());
				System.out.println(stu1.getPhone());

			}
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
