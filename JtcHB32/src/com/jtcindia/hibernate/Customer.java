package com.jtcindia.hibernate;

public class Customer {
	private String customerId;
	private String cname;
	private String email;
	private Long phone;
	public Customer() {
		super();
	}
	public Customer(String cname, String email, Long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cname=" + cname + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
	
	

}
