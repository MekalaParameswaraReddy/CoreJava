package com.paru.oops.interfacee.classininterface;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public class LibraryImpl implements Library {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book = new Book(100, "Rich dad and poor dad");
		LibraryImpl impl = new LibraryImpl();
		impl.issueBook(book);
		impl.retrieveBook(book);
	}

	@Override
	public void issueBook(Book b) {
		System.out.println("Book is issued");
		System.out.println(b.getBookId() + " == " + b.getBookName());
	}

	@Override
	public void retrieveBook(Book b) {
		System.out.println("Book is retrieveBook");
		System.out.println(b.getBookId() + " == " + b.getBookName());
	}
}
