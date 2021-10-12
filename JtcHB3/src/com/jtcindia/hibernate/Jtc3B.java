
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

public class Jtc3B {
	public static void main(String[] args) {
		Transaction tx =null;
		try {
		

		SessionFactory sf = AhibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();

		AStudent stu = (AStudent)session.load(AStudent.class, 1);
		System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getDob());
		System.out.println(stu.getEmails()+"\t"+stu.getMarks()+"\t"+stu.getPhones()+"\t"+stu.getRefs());
		
		session.close();
		System.out.println("entered.....");
		
		}    catch (Exception e){
	        e.printStackTrace();
	        if (tx!=null)
	            tx.rollback();
	    }

	}
}
