package com.operator;

import java.util.Scanner;

public class Upper_and_lower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char c=sc.next().charAt(0);
		if(c>='A' && c<='Z')
			System.out.println(c+" is upper case");
		else
			System.out.println(c+" is lower case");
		sc.close();
	}

}
