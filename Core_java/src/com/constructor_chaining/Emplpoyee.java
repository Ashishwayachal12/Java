package com.constructor_chaining;

public class Emplpoyee {
	int eid;
	String ename, desination;
	double salary;

	public Emplpoyee(int eid, String ename, String desination, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.desination = desination;
		this.salary = salary;
	}

	public Emplpoyee() {
		this(0, "Unkown", "Unkown", 0.0);
	}

	Emplpoyee(int eid) {
		this(eid, "unkown", "unkown", 0.0);
	}

	Emplpoyee(int eid, String ename) {
		this(eid, ename, "unkown", 0.0);
	}

	Emplpoyee(int eid, String ename, double salary) {
		this(eid, ename, "unkown", salary);
	}

	Emplpoyee(int eid, String ename, double salary, String desination) {
		this(eid, ename, desination, salary);

	}

	public static void main(String[] args) {
		Emplpoyee e = new Emplpoyee(121, "king", "SRE", 1200.0);
		details(e);
		Emplpoyee e1 = new Emplpoyee(162, "martin");
		details(e1);
	}

	private static void details(Emplpoyee e) {
		System.out.println("My employee id is:" + e.eid);
		System.out.println("My ename  is:" + e.ename);
		System.out.println("My desination is:" + e.desination);
		System.out.println("My salary is:" + e.salary);
		System.out.println("----------------------------");

	}

}
