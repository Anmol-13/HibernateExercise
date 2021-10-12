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
@Table(name="Jtcstudent")
public class Student {
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	@Column(name="sname")
	private String sname;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private Long phone;
	@Column()
	private Course course;
//	@ManyToMany(cascade = CascadeType.ALL)
//     @ManyToMany(cascade=CascadeType.ALL)  
//    @JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id")) 
	@ManyToMany
	@JoinTable(name="studentcourses",joinColumns = @JoinColumn(name="sid",referencedColumnName = "sid"),
	inverseJoinColumns = @JoinColumn(name="cid"))
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
