package com.inheritance;

public class B extends A {
	static String b;

	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(a);
		A a = new A();
		System.out.println(a.a);
		System.out.println(b);
	}

}
