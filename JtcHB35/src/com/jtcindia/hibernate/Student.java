package com.jtcindia.hibernate;

public class Student {
	private SID studentid;
	private String sname;
	private String email;
	private String phone;
	public Student() {
		super();
	}
	public Student(SID studentid, String sname, String email, String phone) {
		super();
		this.studentid = studentid;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	public SID getStudentid() {
		return studentid;
	}
	public void setStudentid(SID studentid) {
		this.studentid = studentid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
