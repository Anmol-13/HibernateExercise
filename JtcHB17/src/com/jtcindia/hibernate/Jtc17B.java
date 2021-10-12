package com.jtcindia.hibernate;
import java.util.Collection;

import org.hibernate.*;

public class Jtc17B {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Course cust = (Course)session.load(Course.class, 1);
			System.out.println(cust.toString());
			System.out.println(cust.getStudents());
			Student std = (Student)session.load(Student.class, 1);
			System.out.println(std.toString());
			System.out.println(std.getCourses());
//			
			
			tx.commit();
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
