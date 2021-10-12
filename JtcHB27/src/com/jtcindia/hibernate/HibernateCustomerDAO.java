package com.jtcindia.hibernate;

import java.util.List;

public class HibernateCustomerDAO implements CustomerDAO{

	@Override
	public int addCustomer(Customer cust) {
		Integer it = (Integer)HibernateTemplate.save(cust);
		return it.intValue();
	}

	@Override
	public void updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		HibernateTemplate.update(cust);
		
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		
		HibernateTemplate.delete(Customer.class,cid);
		
	}

	@Override
	public Customer getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		Customer c =(Customer)HibernateTemplate.load(Customer.class, cid); 
		return null;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.email=?";
		Customer c = (Customer)HibernateTemplate.findObject(hql, email);
		return c;
	}

	@Override
	public Customer getCustomerCardNo(int ccno) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.cardNo=?";
		Customer c = (Customer)HibernateTemplate.findObject(hql, ccno);
		
		return c;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		String hql = "from Customer c";
		List<Customer>list = HibernateTemplate.getList(hql);
		return list;
	}

	@Override
	public List<Customer> getAllCustomer(int start, int total) {
		// TODO Auto-generated method stub
		String hql = "from Customer c";
		List<Customer>list = HibernateTemplate.findList(hql,start,total);
		return list;
	}

	@Override
	public List<Customer> getCustomersByCity(String city) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.city=?";
		List<Customer>list = HibernateTemplate.getList(hql,city); 
		
		return list;
	}

	@Override
	public List<Customer> getCustomersByCity(String city, int start, int total) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.city=?";
		List<Customer>list = HibernateTemplate.findList(hql,start,total,city);
		return list;
	}

	@Override
	public List<Customer> getCustomersByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.cname=?";
		List<Customer>list = HibernateTemplate.getList(hql,name);
		return list;
	}

	@Override
	public List<Customer> getCustomersByName(String name, int start, int total) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.cname=?";
		List<Customer>list = HibernateTemplate.findList(hql,start,total,name);
		return list;
	}

	@Override
	public List<Customer> getCustomersByCardType(String cardType) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.cardType=?";
		List<Customer>list = HibernateTemplate.getList(hql,cardType);
		return list;
	}

	@Override
	public List<Customer> getCustomersByCardType(String cardType, int start, int total) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.cardType=?";
		List<Customer>list = HibernateTemplate.findList(hql,start,total,cardType);
		return list;
	}

	@Override
	public List<Customer> getCustomersByStatus(String status) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.status=?";
		List<Customer>list = HibernateTemplate.getList(hql,status);
		return list;
	}

 	@Override
	public List<Customer> getCustomersByStatus(String status, int start, int total) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.status=?";
		List<Customer>list = HibernateTemplate.findList(hql,start,total,status);
		return list;
	}

	@Override
	public List<Customer> getCustomersBal(double bal) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.cardBal=?";
		List<Customer>list = HibernateTemplate.getList(hql,bal);
		return list;
	}

	@Override
	public List<Customer> getCustomersBal(double bal, int start, int total) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.cardBal=?";
		List<Customer>list = HibernateTemplate.findList(hql,start,total,bal);
		return list;
	}

	@Override
	public List<Customer> getCustomers(String city, String cardType, String status) {
		// TODO Auto-generated method stub
		String hql = "from Customer c where c.city=? and c.cardType =? and c.status=?";
		List<Customer>list = HibernateTemplate.getList(hql,city,cardType,status);
		return list;
	}
	

}
