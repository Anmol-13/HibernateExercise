package com.jtcindia.hibernate;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc12B {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx = null;
		try {
			SessionFactory sf = AhibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = (Customer)session.load(Customer.class, 1);
			System.out.println(cust.getCid()+"\t"+cust.getFirstName()+"\t"+cust.getLastName()+"\t"+cust.getEmail()+"\t"+cust.getPhone());
			Address add = cust.getAddress();
			System.out.println(add.getAid()+"\t"+add.getCity()+"\t"+add.getStreet()+"\t"+add.getState());
			tx.commit();
			session.close();
			System.out.println("Record Fetched");

		}    catch (Exception e){
		    e.printStackTrace();
		    if (tx!=null)
		        tx.rollback();
		}


		}
		}