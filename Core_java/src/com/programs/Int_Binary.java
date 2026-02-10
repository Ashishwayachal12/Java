package com.programs;

import java.util.Scanner;

public class Int_Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value to convert int to binary:");
		int n = sc.nextInt();

		String bin = "";
		while (n != 0) {
			int rem = n % 2;
			bin = rem + bin;
			n /= 2;
		}
		System.out.println("Binary value is:" + bin);
		sc.close();
	}

}
