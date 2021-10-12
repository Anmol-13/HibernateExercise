package com.jtcindia.hibernate;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="customer2")
public class Customer {
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private Long phone;
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date stamp;	
	
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

	public java.util.Date getStamp() {
		return stamp;
	}

	public void setStamp(java.util.Date stamp) {
		this.stamp = stamp;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", stamp="
				+ stamp + "]";
	}
	
}
