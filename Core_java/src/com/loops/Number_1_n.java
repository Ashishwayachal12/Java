package com.loops;

import java.util.Scanner;

public class Number_1_n {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ending value:");
		int end=sc.nextInt(),start=1;
		while(start<=end) {
			System.out.println(start++);
		}
		sc.close();
	}

}
