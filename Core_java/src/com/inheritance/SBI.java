package com.inheritance;

public class SBI extends Bank {
	String branchName;

	public SBI(String bName, String ifsc, String branchName) {
		super(bName, ifsc);
		this.branchName = branchName;
	}

	public void details() {
		System.out.println("bank Name:" + bName);
		System.out.println("bank IFSC code:" + ifsc);
		System.out.println("bank Branch is:" + branchName);
		System.out.println("*********--------------*********");
	}

}
