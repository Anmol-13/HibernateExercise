package com.jtcindia.hibernate;
import java.util.Set;

public class Book {
	private int bid;
	private String bname;
	private Double cost;
	private int edition;
	private String pub;
	private Set<Author>authors;
	
	public Book() {
	}

	public Book(String bname, Double cost, int edition, String pub) {
		super();
		this.bname = bname;
		this.cost = cost;
		this.edition = edition;
		this.pub = pub;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	
	
	
	

}
