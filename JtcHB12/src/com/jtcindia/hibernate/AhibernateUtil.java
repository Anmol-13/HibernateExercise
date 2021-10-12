package com.jtcindia.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class AhibernateUtil {
    static SessionFactory factory;
    static{
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg =(AnnotationConfiguration)cfg.configure("hibernate.cfg.xml");
        factory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
