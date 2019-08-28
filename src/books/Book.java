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
