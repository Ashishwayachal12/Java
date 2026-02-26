package com.collection;

import java.util.Vector;

public class Test_2 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("lipstick");
		v.add("Kajol");
		v.add("eye linear");
		System.out.println(v);
		v.add(1, "compact pawder");
		v.remove("lipstick");
		System.out.println(v);
		

	}

}
