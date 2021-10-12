

package com.jtcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc8B {
	public static void main(String[] args) {
		Transaction tx =null;
		try {
		

		SessionFactory sf = AhibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();

		Student stu = (Student)session.load(Student.class, 2);
		System.out.println(stu);
		tx.commit();
		session.close();
		System.out.println("entered.....");
		
		}    catch (Exception e){
	        e.printStackTrace();
	        if (tx!=null)
	            tx.rollback();
	    }

	}
}
