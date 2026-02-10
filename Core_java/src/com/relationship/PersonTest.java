package com.relationship;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person(234, "smith", 19, 1234567890);
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.mobNo);
		
		p.addPan("ABC353FDG");
		System.out.println(p.pancard.id);
		System.out.println(p.pancard.panNo);
		
		
	}

}
