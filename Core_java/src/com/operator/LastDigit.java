package com.operator;

import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		num%=10;
		System.out.println(num);
		sc.close();
	}

}
