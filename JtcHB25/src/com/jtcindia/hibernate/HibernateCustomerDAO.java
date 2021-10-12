package com.jtcindia.hibernate;

public class HibernateCustomerDAO implements CustomerDAO{

	@Override
	public int addCustomer(CustomerTo cto) {
		Customer cust = new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
		Integer it = (Integer) CHibernateTemplate.saveObject(cust);
		return it.intValue();
	}

	@Override
	public void updateCustomer(CustomerTo cto) {
		Customer cust = new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
		CHibernateTemplate.updateObject(cust);
		
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		CHibernateTemplate.deleteObject(Customer.class, cid);
		
	}

	@Override
	public CustomerTo getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		Customer cust = (Customer)CHibernateTemplate.loadObject(Customer.class, cid);
		CustomerTo cto = new CustomerTo(cust.getCid(), cust.getCname(),cust.getEmail(), cust.getPhone(), cust.getCity(),cust.getStatus());
		return cto;
	}
	
	
	

}
