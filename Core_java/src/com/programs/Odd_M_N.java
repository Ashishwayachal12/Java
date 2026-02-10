package com.programs;

import java.util.Scanner;

public class Odd_M_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value:");
		int start = sc.nextInt();
		System.out.println("Enter n value:");
		int end = sc.nextInt();
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 1) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("odd digits count:" + count);
		sc.close();

	}

}
