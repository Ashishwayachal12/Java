package com.relationship;

public class Book {
	String title;
	double price;
	String authorName;

	Author author;

	public Book(String title, double price, String authorName) {
		super();
		this.title = title;
		this.price = price;
		if (authorName.equalsIgnoreCase("king"))
			author = new Author("king", "USA");
		else if (authorName.equalsIgnoreCase("allen"))
			author = new Author("allen", "denmark");
	}

}
