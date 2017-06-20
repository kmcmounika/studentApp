package com.app;

public class Student 
{
	private int sid;
	private String sname;
	private double sfee;
	private int marks;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee
				+ ", marks=" + marks + "]";
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public double getSfee() {
		return sfee;
	}
	public void setSfee(double sfee) {
		this.sfee = sfee;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int sid, String sname, double sfee, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
		this.marks = marks;
	}
	

}
