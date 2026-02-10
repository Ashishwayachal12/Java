package com.loops;

import java.util.Scanner;

public class Number_n_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stating value:");
		int start = sc.nextInt(), end = 1;
		while (start >= end) {
			System.out.println(start--);
		}
		sc.close();
	}

}
