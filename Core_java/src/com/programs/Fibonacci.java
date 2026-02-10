package com.programs;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = 0, b = 1;
		for (int n = sc.nextInt(); n > 0; n--) {
			System.out.print(a + ", ");
			int c = a + b;
			a = b;
			b = c;
		}
		sc.close();
	}

}
