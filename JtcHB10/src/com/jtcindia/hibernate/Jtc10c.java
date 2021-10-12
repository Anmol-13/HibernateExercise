package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc10c {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			OldStudent ostu =new OldStudent("Rai1","Noida","Active",15000.0,"JTC","Prakash@jtc.com",5.6);
			ostu.setSid(1);
			session.save(ostu);
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