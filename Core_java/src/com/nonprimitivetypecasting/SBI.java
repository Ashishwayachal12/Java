package com.nonprimitivetypecasting;

public class SBI extends Bank {
	String branchName;

	public SBI(String bName, String ifsc, String branchName) {
		super(bName, ifsc);
		this.branchName = branchName;
	}
	

}
