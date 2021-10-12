package com.jtcindia.hibernate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;

public class Jtc17A {
	public static void main(String[] arg) {
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Student s1 = new Student("Som", "Som@jtc.com", 999999L);
			Student s2 = new Student("Prakash", "Prakash@jtc.com", 8888L);
			Student s3 = new Student("Prakash", "Prakash@jtc.com", 77777L);

			Course c1 = new Course("Java", "2 monts", 9999L);
			Course c2 = new Course("Jsp", "2 weeks", 888L);
			Course c3 = new Course("EJB", "72 hours", 777L);
			Set<Course>cs1 = new HashSet<Course>();
			cs1.add(c1);
			cs1.add(c2);
			Set<Course>cs2 = new HashSet<Course>();
			cs2.add(c2);
			cs2.add(c3);
			s1.setCourses(cs1);
			s2.setCourses(cs2);
			Set<Course>cs3 = new HashSet<Course>();
			cs3.add(c3);
			s3.setCourses(cs3);
			
			Set<Student>ss1 = new HashSet<Student>();
			ss1.add(s1);
			c1.setStudents(ss1);
			
			Set<Student>ss2 = new HashSet<Student>();
			ss2.add(s1);
			ss2.add(s2);
			c2.setStudents(ss2);
			
			Set<Student>ss3 = new HashSet<Student>();
			ss3.add(s3);
			c3.setStudents(ss3);
			
			session.save(s1);
			session.save(s2);
			session.save(s3);
			
			
			
			
			session.save(c1);
			session.save(c2);
			session.save(c3);
			
			
			
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
