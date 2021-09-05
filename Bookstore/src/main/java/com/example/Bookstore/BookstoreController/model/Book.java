package com.example.Bookstore.BookstoreController.model;



public class Book {
	
	
	private String author;
	private long price;
	private String year;
	private String isbn;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	 public void setBook(String author,long price,String year,String isbn) {
		    this.author = author;
		    this.year=year;
		    this.price=price;
		    this.isbn=isbn;
		  }

}
