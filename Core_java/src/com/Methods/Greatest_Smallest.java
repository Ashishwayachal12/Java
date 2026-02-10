package com.Methods;

import java.util.Scanner;

public class Greatest_Smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		System.out.println(smallestNumber(a, b, c));
		System.out.println(greatestNumber(a, b, c));

		sc.close();
	}

	private static int smallestNumber(int a, int b, int c) {
		return (a > b && a > c ? a : (b > c ? b : c));
	}

	private static int greatestNumber(int a, int b, int c) {
		return (a < b && a < c ? a : (b < c ? b : c));
	}

}
