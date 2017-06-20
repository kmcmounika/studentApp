package com.app;

public class Teacher
{
private int tid;
private String tname;
private double tsal;
private boolean flag;
public Teacher(int tid, String tname, double tsal) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.tsal = tsal;
	
}

public Teacher(int tid, String tname, double tsal, boolean flag) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.tsal = tsal;
	this.flag = flag;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public boolean isFlag() {
	return flag;
}

public void setFlag(boolean flag) {
	this.flag = flag;
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
@Override
public String toString() {
	return "Teacher [tid=" + tid + ", tname=" + tname + ", tsal=" + tsal
			+ "]";
}

}
