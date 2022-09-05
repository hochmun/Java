package Ch11;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}
