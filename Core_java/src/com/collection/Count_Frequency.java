package com.collection;

import java.util.LinkedHashMap;

public class Count_Frequency {

	public static void main(String[] args) {
		int a[] = { 1, 10, 1, 10, 2, 1, 10, 1, 2, 3 };
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			int ele = a[i];
			if (lhm.containsKey(ele)) {
				lhm.put(ele, lhm.get(ele) + 1);
			} else {
				lhm.put(ele, 1);
			}
		}
		System.out.println(lhm);

	}

}
