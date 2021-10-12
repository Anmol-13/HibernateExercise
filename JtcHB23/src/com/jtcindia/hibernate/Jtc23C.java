package com.jtcindia.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc23C {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf= ChibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = (Customer)session.load(Customer.class, 1);
			Book b1 = (Book)session.load(Book.class, 1);
			OrderItem or1 = new OrderItem(3, 1100);
			or1.setBook(b1);
			session.save(or1);
			
			Book b2 = (Book)session.load(Book.class, 1);
			OrderItem or2 = new OrderItem(4, 2200);
			or2.setBook(b2);
			session.save(or2);
			ShippingAddress add = new ShippingAddress("sec-36","Noida", null, "U.P");
			//
			Set<OrderItem>orderItems = new HashSet<OrderItem>();
			orderItems.add(or1);
			orderItems.add(or2);
			Order order = new Order(3, 3300, new Date(), "New");
			order.setAddress(add);
			order.setOrderItems(orderItems);
			add.setOrder(order);
			session.save(add);
			order.setCustomer(cust);
			session.save(order);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		}
	}

}
