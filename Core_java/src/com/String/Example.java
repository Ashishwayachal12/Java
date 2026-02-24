package com.String;

public class Example {
	public static void main(String[] args) {
		String name = "    Smith";
		System.out.println(name);
		String s1 = name.toUpperCase();
		System.out.println(s1);
		String s2 = name.toLowerCase();
		System.out.println(s2);
		String s3 = "allen       ";
		String s4 = name.concat(s3);
		System.out.println(s4);
		String s5 = name.trim();
		System.out.println(s5);
		System.out.println(s4.trim());
		String s6 = "KingK";
		System.out.println(s6.substring(1, 2));
		System.out.println(s6.charAt(0));
		System.out.println(s6.charAt(3));
		System.out.println(s6.indexOf('u'));
		System.out.println(s6.lastIndexOf('n'));
		System.out.println(s6.length());
		System.out.println(s6.contains(name));
		System.out.println(s6.isEmpty());
		System.out.println(s6.toCharArray());
		System.out.println(s6.split(name));
		

	}

}
