package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		try {
			int n = sc.nextInt();
			System.out.println(n);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("main end");
		sc.close();

	}

}
