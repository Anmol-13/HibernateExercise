package com.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class CHibernateUtil {
	static SessionFactory factory = null;
	static {
		try {
			Configuration cfg = new Configuration();
			cfg = cfg.configure("hibernate.cfg.xml");
			factory = cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
