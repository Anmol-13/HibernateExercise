package com.jtcindia.hibernate;

import java.sql.Timestamp;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private Long phone;
	private Timestamp stamp;	
	
	public Customer() {
	}

	public Customer(String cname, String email, Long phone, Timestamp stamp) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.stamp = stamp;
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

	public Timestamp getStamp() {
		return stamp;
	}

	public void setStamp(Timestamp stamp) {
		this.stamp = stamp;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", stamp="
				+ stamp + "]";
	}
	
	

	
	
	

	
	
	

}
