package com.jtcindia.hibernate;

public class SilverCustomer extends Customer{
	private String city;
	private int rpoints;
	private String oemail;
	
	public SilverCustomer() {
	}

	public SilverCustomer(String cname, String email, Long phone,String city, int rpoints, String oemail) {
		super(cname, email, phone);
		this.city = city;
		this.rpoints = rpoints;
		this.oemail = oemail;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRpoints() {
		return rpoints;
	}

	public void setRpoints(int rpoints) {
		this.rpoints = rpoints;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}
	
	


	

	
	
	
	
	

}