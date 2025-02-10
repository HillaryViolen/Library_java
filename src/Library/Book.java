package Library;

public class Book {
	public String title;
	public String isbn;
	public Author author;
	
	public Book(String title, String isbn, Author author) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}
	public Author getAuthor() {
		return author;
	}

	public String toString() {
		return "Title : " + title + "\n"+
				"ISBN : " + isbn + "\n" +
				"Author : " + author.getName() + "\n" +
				"Biography : " + author.getBiography() + "\n" +
				"------------------------\n";
	}
}
