package com.paru.oops.interfacee.classininterface;

/**
 * @author: Paramesh
 * @version:
 * @Since:
 */
public interface Library {

	void issueBook(Book b);

	void retrieveBook(Book b);

	public class Book {

		int bookId;

		String bookName;

		/**
		 * Default Constructor
		 */
		public Book(int bookId, String bookName) {
			super();
			this.bookId = bookId;
			this.bookName = bookName;
		}

		/**
		 * @return the bookId
		 */
		public int getBookId() {
			return bookId;
		}

		/**
		 * @param bookId
		 *            the bookId to set
		 */
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		/**
		 * @return the bookName
		 */
		public String getBookName() {
			return bookName;
		}

		/**
		 * @param bookName
		 *            the bookName to set
		 */
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

	}
}
