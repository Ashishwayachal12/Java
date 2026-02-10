package com.operator;

import java.util.Scanner;

public class Conditional_GreatestNumber_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int res = (a > b && a > c) ? a : (b > c ? b : c);
		System.out.println(res);
		sc.close();
	}

}
