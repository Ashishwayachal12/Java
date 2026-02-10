package com.operator;

import java.util.Scanner;

public class Even_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		String res=num%2==0?num+" is Even number."+num:" is Odd number.";
		System.out.println(res);
		sc.close();
		
	}

}
