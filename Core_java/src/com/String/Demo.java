package com.String;

public class Demo {
	public static void main(String[] args) {
		String s1 = new String("java");
		System.out.println(s1);
		String s2 = new String("bava");
		System.out.println(s2);
		String s3 = new String("java");
		System.out.println(s3);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));

	}

}
