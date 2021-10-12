package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc10f {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Student stu = (Student)session.load(Student.class, 1);
			System.out.println(stu);
			CurrentStudent cstu =(CurrentStudent)session.load(CurrentStudent.class, 1);
			System.out.println(cstu);
			OldStudent ostu =(OldStudent)session.load(OldStudent.class, 1);
			System.out.println(ostu);
			WeekdayStudent wstu =(WeekdayStudent)session.load(WeekdayStudent.class, 1);
			System.out.println(wstu);
			WeekendStudent westu =(WeekendStudent)session.load(WeekendStudent.class, 1);
			System.out.println(westu);
			
		    
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