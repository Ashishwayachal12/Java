package com.nonprimitivetypecasting;

public class SBITest {
	public static void main(String[] args) {
//		SBI s = new SBI("slice", "TDLDSDH5633", "Nagawara");
		Bank b = new SBI("slice", "TDLDSDH5633", "Nagawara");
		System.out.println(b.bName);
		System.out.println(b.ifsc);
//		System.out.println(s.branchName);
		SBI s = (SBI) b;
		System.out.println(s.branchName);
		System.out.println(s instanceof Bank);

	}

}
