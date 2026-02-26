package com.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample_2 {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("smith");
		set.add("Samerth");
		set.add("srillera");
		set.add("rashika");
//		System.out.println(set);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
