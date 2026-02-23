package com.String;

public class Test {
	public static void main(String[] args) {
		String s1 = "smith";
		System.out.println(s1);
		String s2 = "java";
		System.out.println(s2);
		String s3 = "java";
		System.out.println(s3);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));

	}

}
