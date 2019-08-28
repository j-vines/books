package books;

public class Book {

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
	
	
}
