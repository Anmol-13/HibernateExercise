package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc10d {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			WeekdayStudent wds = new WeekdayStudent("SP","Noida","Activate",14000.0,2000,"10:00 - 2:00","Noida","M.Tech","98%",2019);
			wds.setSid(1);
			session.save(wds);
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