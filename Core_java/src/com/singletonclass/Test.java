package com.singletonclass;

public class Test {
	public static void main(String[] args) {
		Student.getInstance(10, "smith", 22, 728272927).details();
		Student.getInstance(101, "allen", 23, 45456457).details();
	}

}
