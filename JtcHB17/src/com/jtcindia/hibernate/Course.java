package com.jtcindia.hibernate;

import java.util.Set;

public class Course {
	private Integer cid;
	private String cname;
	private String duration;
	private Long cost;
	private Set<Student>students;
	
	public Course() {
		
	}
	public Course(String cname, String duration, Long cost) {
		super();
		this.cname = cname;
		this.duration = duration;
		this.cost = cost;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", cost=" + cost  ;
	}
	
	
	
	
	
}
