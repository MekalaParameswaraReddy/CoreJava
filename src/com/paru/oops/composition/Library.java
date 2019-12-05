package com.paru.oops.composition;

import java.util.List;

public class Library {
	private List<Books> books;

	public Library(List<Books> books) {
		super();
		this.books = books;
	}

	public List<Books> getBooksInLibrary() {
		return books;
	}
}
