package com.jtcindia.hibernate;

public class CurrentStudent extends Student{
	private int feebal;
	private String branch;
	private String sname;
	private String timings;
	public CurrentStudent() {
		
	}
	public CurrentStudent(String sname, String city, String status,double totalfee, int feebal,String timings,String branch) {
		super(sname, city, status, totalfee);
		this.feebal = feebal;
		this.timings = timings;
		this.branch = branch;
	}

	
	public int getFeebal() {
		return feebal;
	}
	public void setFeebal(int feebal) {
		this.feebal = feebal;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		
		return super.toString()+feebal+" "+timings+" "+branch;
	}
	
	
	
	
	
	

}
