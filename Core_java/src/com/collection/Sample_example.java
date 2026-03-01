package com.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Sample_example {
	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new UserSorting_sample_example());
		tm.put("iphone", 1000.0);
		tm.put("pumashoes", 8886.729);
		tm.put("xlsuper", 4679.38);
		tm.put("jcb", 600.0);
		System.out.println(tm);
		Set<Entry<String, Double>> entry = tm.entrySet();
		for (Map.Entry<String, Double> e : entry) {
			System.out.println(e);
		}

	}

}
