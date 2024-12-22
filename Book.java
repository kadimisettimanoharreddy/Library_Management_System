package com.FrameWorkProject;

import java.util.Scanner;

public class Book {
	private String title,author,isbn;
	private double rating;
	Scanner sc=new Scanner(System.in);
	public Book(String title,String author,String isbn,double rating) {
		setTitle(title);
		setAuthor(author);
		setIsbn(isbn);
		setRating(rating);
	}
    public void setTitle(String title) {
    	this.title=title;
    }
    public void setAuthor(String author) {
    	this.author=author;
    }
    public void setIsbn(String isbn) {
    	this.isbn=isbn;
    }
    public void setRating(double rating) {
    	if(rating>10) {
    		System.out.println("Invalid Rating");
    		System.out.println("Rating must be in the range of 1-10");
    	}else {
    			this.rating=rating;
    		}
    }
    	public String getTitle( ) {
    		return title;
    	}
    	public String getAuthor() {
    		return author;
    	}
    	public String getIsbn( ) {
    		return isbn;
    	}
    	public double getRating( ) {
    	 return rating;
    	}
    	public String toString( ) {
    		return getTitle( )+"by"+" "+getAuthor( )+" "+"("+getRating()+")\n";
    	}
    }