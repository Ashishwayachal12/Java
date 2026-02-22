package com.overriding;

public class Test {
	public static void main(String[] args) {
		Father f = new Son();
		f.study();
		Son s = (Son) f;
		s.study();
		System.out.println(s instanceof Father);
		Father f1 = new Father();
		f1.study();
	}

}
