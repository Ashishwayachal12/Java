package com.encpsulation;

public class StudentTest {
	public static void main(String[] args) {
		Stundent s = new Stundent(123, "allen", "CSE");
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.dept);
		s.setsid(10);
		s.setname("martin");
		s.setdept("ISE");
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.dept);
	}

}
