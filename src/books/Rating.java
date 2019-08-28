package books;

public class Rating {

	int stars;
	String review;
	static final int MAX_REVIEW_LENGTH = 150;
	static final int MAX_STARS = 5;
	
	/**
	 * Creates Rating object to be used as a parameter of the Book class
	 * @param stars, the number of stars the user rates a book. Can be out of 5.
	 * @param review, a 150 character max written review of a book.
	 */
	public Rating(int stars, String review) {
		this.stars = stars;
		this.review = review;
	}
	
	/**
	 * Creates a Rating of only stars.
	 * @param stars, the number of stars the user rates a book. Can be out of 5.
	 */
	public Rating(int stars) {
		this.stars = stars;
	}
}
