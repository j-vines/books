package books;

import java.util.Arrays;
import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L; //Default serialVersion
	String title;
	String[] author;
	String date_published;
	Rating rating;
	
	/**
	 * Creates book object
	 * @param title, the title of the book
	 * @param author, an array with an element for each author that worked on the book
	 * @param date_published, the date the book was published
	 * @param rating, a rating object which contains a star rating out of 5 and an optional review
	 */
	public Book(String title, String[] author, String date_published, Rating rating) {
		this.title = title;
		this.author = author;
		this.date_published = date_published;
		this.rating = rating;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public String getDate_published() {
		return date_published;
	}

	public void setDate_published(String date_published) {
		this.date_published = date_published;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	@Override
	public boolean equals(Object o) { 
		if(o == this) return true;
		if(!(o instanceof Book)) return false;
		
		Book b = (Book) o;
		
		return this.title.contentEquals(b.title) &&
				Arrays.equals(this.author, b.author) &&
				this.date_published.contentEquals(b.date_published) &&
				this.rating.equals(b.rating);
	}
	
	@Override
	public String toString() {
		
		StringBuilder book = new StringBuilder();
		
		//title
		book.append(title + "\n");
		
		//author(s)
		if(this.author.length > 1) {
			book.append("Authors: ");
		} else book.append("Author: ");
		
		for(int i = 0; i < this.author.length; i++) {
			book.append(author[i]);
			if(author.length - 1 != i) {
				book.append(", ");
			} else book.append("\n");
		}
		
		//date published
		book.append("Published: " + date_published + "\n\n");
		
		//rating
		book.append(rating.toString());
		
		return book.toString();
		
	}
	
}
