package com.operator;

import java.util.Scanner;

public class Upper_lower_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char c=sc.next().charAt(0);
		if(c>='A' && c<='Z')
			System.out.println(c+" is upper case");
		else if(c>='a' && c<='z')
			System.out.println(c+" is lower case");
		else if (c>='0' && c<='9')
			System.out.println(c+ " digit");
		else 
			System.out.println(c+" is a special character");
		
		sc.close();
	}

}
	