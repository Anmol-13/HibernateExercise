package com.jtcindia.hibernate;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
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
		Object obj = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			obj = session.load(cls, id);
			
			
			tx.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
		return obj;	
	}
	
	public static void  update(Object obj) {
		Object id = null;
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			Transaction tx = session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void  delete(Class cls,Serializable id) {
		Transaction tx = null;
		Object obj = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			obj = session.load(cls, id);
			session.delete(obj);
			
			
			tx.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}
	
	public static List getList(String hql,Object ... args) {
		Transaction tx = null;
		List list = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Query q = session.createQuery(hql);
			for(int i=0;i<args.length;i++) {
				q = q.setParameter(i, args[i]);
			}
			list = q.list();
			
			tx.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
		return list;
		
	}
	
	public static List findList(String hql,int start,int total,Object ... args) {
		Transaction tx = null;
		List list = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Query q = session.createQuery(hql);
			q.setFirstResult(start);
			q.setMaxResults(total);
			for(int i=0;i<args.length;i++) {
				q = q.setParameter(i, args[i]);
			}
			list = q.list();
			
			tx.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		
	}
		return list;
	
}
	
	
	public static Object findObject(String hql,Object ... args) {
		Transaction tx = null;
		Object obj = null;
		
		try {
			SessionFactory sf = ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Query q = session.createQuery(hql);
			
			for(int i=0;i<args.length;i++) {
				q = q.setParameter(i, args[i]);
			}
			obj = q.uniqueResult();
			
			tx.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		
	}
		return obj;
	}
}