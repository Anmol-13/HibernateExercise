package com.jtcindia.hibernate;

import java.util.Set;

public class Student {
	private Integer sid;
	private String sname;
	private String email;
	private Long phone;
	private Course course;
	private Set<Course>courses;
	public Student() {
		
	}
	public Student(String sname, String email, Long phone) {
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
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
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", email=" + email + ", phone=" + phone  ;
	}
	
	
	
	
	
	
	
	

}
