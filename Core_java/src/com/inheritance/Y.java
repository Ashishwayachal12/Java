package com.inheritance;

public class Y extends X {
	int y;

	public static void main(String[] args) {
		Y y1 = new Y();
		System.out.println(y1.y);
		System.out.println(y1.x);
		X x1 = new X();
		System.out.println(x1.x);
//		System.out.println(x1.y); //CTE

	}

}
