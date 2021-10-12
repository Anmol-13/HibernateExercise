package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc10a {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			Student studnew = new Student("som","Noida","Active",14000.0);
			session.save(studnew);
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