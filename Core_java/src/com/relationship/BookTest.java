package com.relationship;

public class BookTest {
	public static void main(String[] args) {
		Book b = new Book("Java", 50, "king");
		System.out.println(b.title);
		System.out.println(b.price);
		System.out.println(b.author.name);
		System.out.println(b.author.nationality);
	}

}
