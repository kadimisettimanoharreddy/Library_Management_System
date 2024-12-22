package com.FrameWorkProject.Service;

import com.FrameWorkProject.ManageData.BookDAO;
import com.FrameWorkProject.Book;

public class LibraryService {
	Book book;
	BookDAO bd=new BookDAO( );
	public void addBook(String title,String author ,String isbn,double rating) {
		book=new Book(title,author,isbn,rating);
		bd.addBook(book);
	}
	public void updateRating(String isbn) {
		bd.updateBookRating(isbn);
		
	}

    public void displayAll() {
	bd.getAllBooks( );
	
}
	public void displayTopRated( ) {
		book =bd.topRated( );
		if(book!=null) {
			System.out.println("The Top Rated Book is the Library:");
			System.out.println(book);
		}
		else {
			System.out.println("Empty Library");
		}
	}
	

}