package com.jtcindia.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc23B {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			CreditCard cc1 = new CreditCard(1111, "mastercard", 922,new Date());
			session.save(cc1);
			SilverCustomer c1 = new SilverCustomer("Anmol", "anmoldeepsingh1002@gmail.com", 987456L, "Amritsar", 10, "c@jtc");
			c1.setCcard(cc1);
			session.save(c1);
			Map<String, String>refs = new HashMap<String, String>();
			refs.put("AA", "11");
			refs.put("BB", "22");
			CreditCard cc2 = new CreditCard(2222, "visa", 7890, new Date());
			session.save(cc2);
			GoldCustomer c2 = new GoldCustomer("anmol", "anmoldeepsingh@gmail.com",1234L, 4321L, refs, 1000);
			c2.setCcard(cc2);
			session.save(c2);
			
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
