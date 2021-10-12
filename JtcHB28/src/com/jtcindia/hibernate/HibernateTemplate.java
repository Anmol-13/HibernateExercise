package com.jtcindia.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplate {
	
	public static Object save(Object obj) {
		Transaction tx = null;
		Object ob = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			ob = session.save(obj);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
		return ob;
	}
	
	
	public static Object load(Class cls,Serializable id) {
		Transaction tx = null;
		Object ob = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			ob = session.load(cls, id);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
		return ob;
		
	}
	
	public static void update(Object obj) {
		Transaction tx = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			session.update(obj);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}
	
	public static void delete(Class cls,Serializable id) {
		Transaction tx = null;
		Object obj;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			obj = session.load(cls, id);
			session.delete(obj);
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
		
	}
	
	public static List  getList(Class cls) {
		Transaction tx = null;
		List list = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Criteria ct = session.createCriteria(cls);
			list = ct.list();
			
			tx.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
		
	}
		
	}
	
	

}
