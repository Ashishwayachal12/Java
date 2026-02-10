package com.operator;

public class Post_increment {
	public static void main(String[] args) {
		int a=5;
		int b=a++;
		int c=b++ + b++;
		int d=a++ - c++;
		System.out.println(a+" "+b+" "+c+" "+d);
		
		
	}

}
