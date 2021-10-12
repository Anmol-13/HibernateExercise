package com.jtcindia.hibernate;

public class WeekdayStudent extends CurrentStudent{
	private String qualification;
	private String percentage;
	private double yop;
	public WeekdayStudent() {
	}
	public WeekdayStudent(String sname, String city, String status,double totalfee, int feebal,String timings,String branch,String qualification, String percentage, double yop) {
		super(sname,city,status,totalfee,feebal,timings,branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yop = yop;
	}
	
	
	
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public double getYop() {
		return yop;
	}
	public void setYop(double yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		
		return super.toString()+" " +qualification+" "+percentage+" "+yop;
	}
	
	
	
	

}
