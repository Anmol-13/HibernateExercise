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

public class Jtc3A {
	public static void main(String[] args) {
		Transaction tx =null;
		try {
		

		SessionFactory sf = AhibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();

		String course[] = { "java", "JDBC", "JSP" };

		List<String> Ems = new ArrayList<String>();
		Ems.add("aa@jtc");
		Ems.add("bb@jtc");
		Ems.add("cc@jtc");

		List<Integer> Marks = new ArrayList<Integer>();
		Marks.add(new Integer(100));
		Marks.add(new Integer(99));
		Marks.add(new Integer(100));

		Set<Long> Phs = new HashSet<Long>();
		Phs.add(new Long((1111)));
		Phs.add(new Long((2222)));
		Phs.add(new Long((3333)));

		Map<String, Long> Refs = new HashMap<String, Long>();
		Refs.put("aaa", new Long(1111));
		Refs.put("bbb", new Long(2222));
		Refs.put("ccc", new Long(3333));

		AStudent stu = new AStudent("som", "10-10-10", "M.Sc", course, Ems, Marks, Phs, Refs);
		session.save(stu);

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
