package com.jtcindia.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SIDGenerator {
	public static SID getNextSid(String bid) {
		SID sid = null;
		Transaction tx = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			String hql = "from Student stu where stu.studentid.bid=?";
			Query q = session.createQuery(hql);
			q.setString(0, bid);
			List l1 = q.list();
			if (l1.size()==0) {
				sid = new SID(bid, "001");
				
			} else {
				String hql1 = "select max(stu.studentid.sid) from Student stu where stu.studentid.bid=?";
				Query q1= session.createQuery(hql1);
				q.setString(0, bid);
				String id = q.list().get(0).toString();
				int x = Integer.parseInt(id);
				x= x+1;
				if(x<=9) {
					sid = new SID(bid, "00"+x);
				}else if (x<=99) {
					sid = new SID(bid, "0"+x);
					
				}
				else if (x<=999) {
					sid = new SID(bid, ""+x);
					
				}

			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null) {
				tx.rollback();
				
			}
			e.printStackTrace();
		}
		
		return sid;
	}

}
