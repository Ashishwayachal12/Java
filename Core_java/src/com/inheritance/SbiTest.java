package com.inheritance;

public class SbiTest {
	public static void main(String[] args) {
		SBI sbi = new SBI("state bank of india", "TVD5755", "Nagawara");
		sbi.details();
		SBI sbi1 = new SBI("state bank of india", "GHDF766FG", "kb");
		sbi1.details();
	}

}
