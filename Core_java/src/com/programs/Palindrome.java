package com.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int copy = n, rev = 0;
		while (n != 0) {
			rev =rev* 10 + (n % 10);
			n /= 10;
		}
		if (rev == copy) {
			System.out.println("palindrom");
		} else {
			System.out.println("Not a palendrom");
		}
		sc.close();

	}

}
