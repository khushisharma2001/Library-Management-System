package library_project;

import java.io.File;
import java.util.ArrayList;

public class Book extends AllDocuments{

	private String title;
	private String author;
	private boolean isAvailable;
	private String bookID;
	private int publicationYear;
	
	private DatabaseManager databaseManager;

	public Book(String title, String author, String bookID, int publicationYear) {
	    this.title = title;
	    this.author = author;
	    this.bookID = bookID;
	    this.publicationYear = publicationYear;
	}
	
	public Book(DatabaseManager databaseManager) {
	    this.databaseManager = databaseManager;
	}


	public Book getBook(String title, String author) {
	    this.title = title;
	    this.author=author;
	    return null;
	}
	
	public Book getBook(String bookID) {
	    this.bookID = bookID;
	    ArrayList<Book> bookManager = databaseManager.getBooks();
	    Book bookFound = null;
	    
	    for(Book book: bookManager) {
	    	if(book.getTitle().contains(bookID)) {
	    		System.out.println("Book found");
	    		bookFound = book;
	    	}
	    }
	    return bookFound;
	}
	
	public Book getSearchResult(String searchItem) {
		//logic
		ArrayList<Book> bookManager = databaseManager.getBooks();
	    Book bookFound = null;
	    
	    for(Book book: bookManager) {		//Enhanced For-loop
	    	System.out.println(book.getTitle());
	    	if(book.getTitle().contains(searchItem) || book.getAuthor().contains(searchItem)
	    			|| (book.getPublicationYear()+"").contains(searchItem) || book.getBookID().contains(searchItem)) {
	    		System.out.println("Book found");
	    		bookFound = book;
	    		break;
	    	}
	    }
	    return bookFound;
	}
	
	public void borrowBook() {
	    if (isAvailable) {
	        isAvailable = false;
	        System.out.println("Book borrowed: " + title);
	    } else {
	        System.out.println("Book not available.");
	    }
	}
	
	public void returnBook() {
	    isAvailable = true;
	    System.out.println("Book returned: " + title);
	}

	@Override
	public String toString() {
	    return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", available=" + isAvailable + '}';
	}
	
	public String getTitle() {
		return title; 
	}
	
	public String getAuthor() {
		return author; 
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	void photocopier() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void emailBook() {
		// TODO Auto-generated method stub
		
	}
	
	
}







