package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample_demo {
	public static void main(String[] args) {
		Map<String, Double> h = new HashMap<String, Double>();
		h.put("iphone", 1000.0);
		h.put("pumashoes", 8886.729);
		h.put("xlsuper", 4679.38);
		h.put("jcb", 600.0);
		System.out.println(h);
		Collection<Double> prices = h.values();
		System.out.println(prices);
		Set<String> product = h.keySet();
		System.out.println(product);
		Set<Entry<String, Double>> entry = h.entrySet();
		for (Map.Entry<String, Double> e : entry) {
			System.out.println(e);
		}

	}

}
