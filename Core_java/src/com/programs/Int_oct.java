package com.programs;

import java.util.Scanner;

public class Int_oct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		String oct = "";

		while (n != 0) {
			int rev = n % 8;
			oct = rev + oct;
			n /= 8;
		}
		System.out.println("Octal value is:" + oct);
		sc.close();
	}

}
