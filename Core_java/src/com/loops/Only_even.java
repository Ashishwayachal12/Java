package com.loops;

import java.util.Scanner;

public class Only_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		while (n > 0) {
			int last = n % 10;
			if (last % 2 == 0) {
				System.out.println(last);
			}
			n /= 10;
			sc.close();
		}
	}

}
