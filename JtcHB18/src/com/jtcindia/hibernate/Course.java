package com.jtcindia.hibernate;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="jtccourses")
public class Course {
	@Id
	@Column(name="cid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="cost")
	private Long cost;
	
	@ManyToMany(mappedBy ="courses" )
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
