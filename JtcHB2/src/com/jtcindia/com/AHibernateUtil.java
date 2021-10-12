package com.jtcindia.com;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class AHibernateUtil {
    static SessionFactory factory;
    static{
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg =(AnnotationConfiguration)cfg.configure();
        factory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
