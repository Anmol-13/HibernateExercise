package com.jtcindia.hibernate;
import javax.persistence.*;


@Entity
@Table(name="mystudents1")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
	
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(name = "sname")
	private String sname;
	@Column(name = "city")
	private String city;
	@Column(name = "totalfee")
	private double totalfee;
	@Column(name="status")
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
