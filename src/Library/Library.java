package Library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added to library : " + book.getTitle());
		
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		if(books.contains(book)) {
			books.remove(book);
			borrower.addBook(book);
			System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
		}
	}
	
	public void returnBook(Borrower borrower, Book book) {
		if(borrower.removeBook(book)) {
			books.add(book);
			System.out.println(borrower.getName() + " returned " + book.getTitle());
		}
	}

	public void displayLibraryBooks() {
		for(Book book: books) {
			System.out.println(book);
		}
	}
}

