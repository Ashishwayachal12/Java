package com.collection;

import java.util.TreeSet;

public class Demo_3 {
	public static void main(String[] args) {
		UserSorting us = new UserSorting();
		TreeSet<Object> set = new TreeSet<>(us);
		set.add(10);
		set.add(5);
		set.add(80);
		set.add(45);
		set.add(34);
		System.out.println(set);
	}

}
