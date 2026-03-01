package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Sample_Test {
	public static void main(String[] args) {
		Map<Object, Object> h = new HashMap<Object, Object>();
		h.put(101, "Smith");
		h.put(198, "allen");
		h.put(11, "martin");
		h.put(87, "king");
		h.put(87, "king");
		System.out.println(h);
		System.out.println(h.remove(87));
		System.out.println(h);
		System.out.println(h.get(87));
		System.out.println(h.containsKey(86));
		System.out.println(h.containsValue("King"));

	}

}
