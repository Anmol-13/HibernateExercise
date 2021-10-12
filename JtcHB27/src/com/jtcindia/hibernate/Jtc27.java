package com.jtcindia.hibernate;

import java.util.List;

public class Jtc27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDAO cdao = DAOFactory.getCustomerDAO();
		Customer cust = new Customer("vivek", "vivek@gmail.com", "Noida", 28000d, "Master", 12345, "Active");
		cdao.addCustomer(cust);
		
		Customer cust1 = new Customer("Sachin", "Sachin@gmail.com", "Noida", 28000d, "Master", 12347, "Active");
		cdao.addCustomer(cust1);
		
		Customer cust2 = new Customer("Som", "Som@gmail.com", "Noida", 28000d, "Master", 12347, "Active");
		cdao.addCustomer(cust2);
		
		Customer cust3 = new Customer("pooja", "pooja@gmail.com", "Noida", 28000d, "Master", 12347, "Active");
		cdao.addCustomer(cust3);
		
		
		Customer cust4 = new Customer("Mukhtar", "Mukhtar@gmail.com", "Amritsar", 28000d, "Master", 12347, "Active");
		cdao.addCustomer(cust4);
		cdao.deleteCustomer(1);
		
		System.out.println("All Customers");
		List<Customer> list = cdao.getAllCustomer();
		
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Customer By City");
		list = cdao.getCustomersByCity("Noida");
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Customer By City 0 to 3");
		list = cdao.getCustomersByCity("Noida",0,3);
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Customer by cardType");
		list = cdao.getCustomersByCardType("Master");
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Customer by cardType 0 to 3");
		list = cdao.getCustomersByCardType("Master",0,3);
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Coustomer by bal");
		list = cdao.getCustomersBal(28000d);
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Coustomer by bal 0 to 1");
		list = cdao.getCustomersBal(28000d,0,1);
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Coustomer by status");
		list = cdao.getCustomersByStatus("Active");
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Coustomer by status 0 to 3");
		list = cdao.getCustomersByStatus("Active",0,3);
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Coustomer by name");
		list = cdao.getCustomersByName("vivek");
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Coustomer by CardType");
		list = cdao.getCustomers("Noida", "Master", "Active");
		for(Customer c:list) {
			System.out.println(c);
		}
		
		System.out.println("Get Coustomer by email");
		Customer c = cdao.getCustomerByEmail("vivek@gmail.com");
		System.out.println(c);
		
		System.out.println("Get All Customer BY CCNO");
		Customer co = cdao.getCustomerCardNo(12345);
		System.out.println(co);
		

		

	}

}
