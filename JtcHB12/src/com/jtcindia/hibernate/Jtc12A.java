package com.jtcindia.hibernate;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc12A {public static void main(String[] args) {
	Transaction tx = null;
	try {
		SessionFactory sf = AhibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		tx = session.beginTransaction();
		
		Customer cust = new Customer("Som","Prakash","Som@jtc","1234");
		session.save(cust);
		
		Address add = new Address("sec-2","Noida","UttarPradesh");
		session.save(add);
		cust.setAddress(add);
		tx.commit();
		session.clear();
		System.out.println("entered.....");
		
		
		
		
	
	
}    catch (Exception e){
    e.printStackTrace();
    if (tx!=null)
        tx.rollback();
}


}
}