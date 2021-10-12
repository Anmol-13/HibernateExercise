package com.jtcindia.hibernate;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Jtc7A {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			
			Student studnew = new Student("som","Noida","Enabled",15000.0);
			Integer it =(Integer)session.save(studnew);
			System.out.println(it.intValue());
			
			
			CurrentStudent cstu = new CurrentStudent("Rai","Noida","Enabled",15000.0,2000,"6:30 P.M","Sector-2");
			it =(Integer)session.save(cstu);
			System.out.println(it.intValue());
			

			
			
			OldStudent ostu =new OldStudent("aa","Noida","Enabled",15000.0,"WEBEARN","aa@sp.com",9.0);
			it = (Integer)session.save(ostu);
			System.out.println(it.intValue());
			
			
			WeekdayStudent Wdstu = new WeekdayStudent("bb","noida","Enabled",15000.0,2000,"6:30 PM","ECE","B.Tech","85.5",2019);
			it = (Integer)session.save(Wdstu);
			System.out.println(it.intValue());
//			
			WeekendStudent wstu = new WeekendStudent("cc","Noida","Enabled",15000.0,2000,"6:30 PM","GR NOIDA","WEBEARN","cc@sp.com",9.0);
			it =(Integer)session.save(wstu);
			System.out.println(it.intValue());
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