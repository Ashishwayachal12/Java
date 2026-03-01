package com.collection;

public class Sample_thread {
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		System.out.println(th.getName());
		th.setName("smith");
		System.out.println(th.getName());
		System.out.println(10/0);

	}

}
