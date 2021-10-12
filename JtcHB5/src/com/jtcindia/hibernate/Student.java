package com.jtcindia.hibernate;

public class Student {
	private int sid;
	private String city;
	private double totalfee;
	private String sname;
	private String status;
	public Student() {
		
	}
	
	
	public Student( String sname,String city,String status, double totalfee  ) {
		this.city = city;
		this.totalfee = totalfee;
		this.sname = sname;
		this.status = status;
	}


	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}
	
	
	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		
		return sid+" "+sname+" "+city+" "+status+" "+totalfee;
	}
	
	
	
	
	

}
