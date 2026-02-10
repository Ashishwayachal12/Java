package com.loops;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt(), count = 0;
		for (; n > 0; n /= 10) {
			count++;
			sc.close();
		}
		System.out.println(count);

	}

}
