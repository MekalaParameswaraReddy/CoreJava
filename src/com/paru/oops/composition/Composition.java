package com.paru.oops.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * In composition, both the entities are dependent on each other.
 * 
 * When there is a composition between two entities, the composed object cannot
 * exist without the other entity.
 * 
 * Library can have no. of books. So, If Library gets destroyed then All books
 * within that particular library will be destroyed. i.e. book can not exist
 * without library. That’s why it is composition.
 */
public class Composition {

	public static void main(String[] args) {
		Books java = new Books("Java complete referance", "Herbert Schildt");
		Books hibernate = new Books("Hibernate ORM tool", "Gavian King");
		Books spring = new Books("Java/J2ee Spring", "Rod Johanson");
		List<Books> books = new ArrayList<Books>();
		books.add(java);
		books.add(hibernate);
		books.add(spring);
		Library library = new Library(books);
		List<Books> bookList = library.getBooksInLibrary();
		for (Books book : bookList) {
			System.out.println(book.name + " :: " + book.author);
		}
	}
}
