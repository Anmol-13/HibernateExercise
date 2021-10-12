package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc10e {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			WeekendStudent wstu = new WeekendStudent("Student","Noida","Activate",20000.0,5000,"8:00 -2:00 PM","GR NOIDA","WEBEARN","cc@sp.com",12.5);

			wstu.setSid(1);
			session.save(wstu);
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