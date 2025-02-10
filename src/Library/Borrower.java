package Library;

import java.util.ArrayList;

public class Borrower {
	private String name;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();
	
	public Borrower(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addBook(Book book) {
		borrowedBooks.add(book);
	}
	
	
	public boolean removeBook(Book book) {
		return borrowedBooks.remove(book);
	}
	
	
	public void displayBorrowedBooks() {
		System.out.println(name + "'s Borrowed Books :");
		
		if (borrowedBooks.isEmpty()) {
	        System.out.println("No borrowed books.");
	        return;
	    }
		
		for(Book book : borrowedBooks) {
			System.out.println(book);
		}
	}
	
}
