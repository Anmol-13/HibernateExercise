package com.jtcindia.hibernate;

public class Customer {
	private int cid;
	private String cname;
	private String email;
	private Long phone;
	private int version;
	
	
	
	public Customer(String cname, String email, Long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}
	public Customer() {
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
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	
	

}
