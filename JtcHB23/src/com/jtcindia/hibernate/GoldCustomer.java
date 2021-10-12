package com.jtcindia.hibernate;

import java.util.Map;

public class GoldCustomer extends Customer {
	private Long ophone;
	private Map<String, String> refs;
	private int points;
	public GoldCustomer() {
		super();
	}
	public GoldCustomer(String cname, String email, Long phone,Long ophone, Map<String, String> refs, int points) {
		super(cname, email, phone);
		this.ophone = ophone;
		this.refs = refs;
		this.points = points;
	}
	public Long getOphone() {
		return ophone;
	}
	public void setOphone(Long ophone) {
		this.ophone = ophone;
	}
	public Map<String, String> getRefs() {
		return refs;
	}
	public void setRefs(Map<String, String> refs) {
		this.refs = refs;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	
	
	
	
	
	

}
