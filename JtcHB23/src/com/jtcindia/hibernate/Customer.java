package com.jtcindia.hibernate;

import java.util.Set;

public abstract class Customer {
	private int cid;
	private String cname;
	private String email;
	private Long phone;
	private CreditCard ccard;
	private Set<Order> orders;
	
	
	
	public Customer() {
	}



	public Customer(String cname, String email, Long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Long getPhone() {
		return phone;
	}



	public void setPhone(Long phone) {
		this.phone = phone;
	}



	public CreditCard getCcard() {
		return ccard;
	}



	public void setCcard(CreditCard ccard) {
		this.ccard = ccard;
	}



	public Set<Order> getOrders() {
		return orders;
	}



	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}



	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + "]";
	}
	
	
	
	
	
	

}
