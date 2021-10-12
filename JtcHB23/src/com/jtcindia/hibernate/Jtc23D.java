package com.jtcindia.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc23D {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf= ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = (Customer)session.load(Customer.class, 1);
			System.out.println("CustomerInfo");
			System.out.println(cust.toString());
			CreditCard cc = cust.getCcard();
			cc.toString();
			Set<Order> ods = cust.getOrders();
			for(Order o:ods) {
				System.out.println("Order Info");
				System.out.println(o.toString());
				ShippingAddress add = o.getAddress();
				System.out.println("Shipping Address Info");
				System.out.println(add.toString());
				Set<OrderItem>items = o.getOrderItems();
				System.out.println("Order Items Info");
				for(OrderItem or:items) {
					System.out.println(or.toString());
				}
				
				
			}
			tx.commit();
			session.close();
			System.out.println("Record Fetched");
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}

}
