package com.collection;

import java.util.Stack;

public class Test_3 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(10);
		s.push(89);
		s.add(4);
		s.push(67);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		

	}

}
