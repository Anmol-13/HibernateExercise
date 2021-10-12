package com.jtcindia.com;
import org.hibernate.*;

public class Jtc1A {   public static void main(String[] args) {
    Transaction tx= null;
    try{
        SessionFactory sf = AHibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        tx = session.beginTransaction();
        Customer cust = new Customer("Anmol", "Anmoldeepsingh@gmail.com", 1023L, "Amritsar", 123.56d);
        session.save(cust);

        tx.commit();
        session.close();

        System.out.println("record inserted");
    }
    catch (Exception e){
        e.printStackTrace();
        if (tx!=null)
            tx.rollback();
    }
}
}
