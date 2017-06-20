package com.app;

public class Teacher
{
private int tid;
private String tname;
private double tsal;
private String taddr;
public Teacher(int tid, String tname, double tsal, String taddr) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.tsal = tsal;
	this.taddr = taddr;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public double getTsal() {
	return tsal;
}
public void setTsal(double tsal) {
	this.tsal = tsal;
}
public String getTaddr() {
	return taddr;
}
public void setTaddr(String taddr) {
	this.taddr = taddr;
}
@Override
public String toString() {
	return "Teacher [tid=" + tid + ", tname=" + tname + ", tsal=" + tsal
			+ ", taddr=" + taddr + "]";
}

}
