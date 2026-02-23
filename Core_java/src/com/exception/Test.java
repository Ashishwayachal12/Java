package com.exception;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("main Start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt(), b = sc.nextInt();
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("can't /zero");
		}
		System.out.println("main end");
		sc.close();
	}

}
