package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionBinary {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(12);
		list.add(89);
		list.add(01);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 34));
	}

}
