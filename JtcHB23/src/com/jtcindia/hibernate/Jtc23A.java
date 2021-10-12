package com.jtcindia.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc23A {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			List<String> quails = new ArrayList<String>();
			quails.add("M.sc");
			quails.add("M.C.A");
			quails.add("M.Tech");
			Set<String>exps = new HashSet<String>();
			exps.add("SUN");
			exps.add("IBM");
			exps.add("Oracle");
			Author a1 = new Author("Jtc", "jtc@gmail.com", new Date(), 123L, quails, exps);
			session.save(a1);
			Author a2 = new Author("Som", "Som@jtc.com", new Date(), 321L, quails, exps);
			session.save(a2);
			Book b1 = new Book("Master Java", 99.99, 1, "som Prakash");
			Book b2 =  new Book("Master Hibernate", 199.99, 1, "som Prakash");	
			Book b3 =  new Book("Master Spring", 299.99, 1, "som Prakash");
			Set<Author>as1 = new HashSet<Author>();
			as1.add(a1);
			Set<Author>as2 = new HashSet<Author>();
			as2.add(a2);
			b1.setAuthors(as1);
			b2.setAuthors(as2);
			b3.setAuthors(as2);
			session.save(b1);
			session.save(b2);
			session.save(b3);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
			
		}
		catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}

}
