package com.programs;

import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt(), sod = 0, pod = 1;
		while (n != 0) {
			sod = sod + (n % 10);
			pod = pod * (n % 10);
			n /= 10;
		}
		if (sod == pod) {
			System.out.println("Spy Number.");
		} else {
			System.out.println("Not a spy number.");
		}
		sc.close();
	}

}
