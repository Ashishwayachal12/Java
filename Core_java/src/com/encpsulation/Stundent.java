package com.encpsulation;

public class Stundent {
	int sid;
	String name;
	String dept;

	public Stundent(int sid, String name, String dept) {
		super();
		this.sid = sid;
		this.name = name;
		this.dept = dept;
	}

	public int getsid() {
		return sid;
	}

	public String getname() {
		return name;
	}

	public String getdept() {
		return dept;
	}

	public void setsid(int sid) {
		this.sid = sid;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setdept(String dept) {
		this.dept = dept;
	}

}
