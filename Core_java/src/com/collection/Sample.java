package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sample {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		System.out.println(set);
	}

}
