package com.microcare.academy;

public class Book {
	
	private int bookId;
	private String title;
	private String author;
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", publishedDate=" + publishedDate + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(int publishedDate) {
		this.publishedDate = publishedDate;
	}
	private double price;
	private int publishedDate;

}
