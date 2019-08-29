package books;

import java.io.Serializable;

public class Rating implements Serializable {

	private static final long serialVersionUID = 1L; //Default serialVersion
	int stars = 0;
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
	
	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public boolean equals(Object o) {
		if(o == this) return true;
		if(!(o instanceof Book)) return false;
		
		Rating r = (Rating) o;
		
		return this.stars == r.stars &&
				this.review.contentEquals(r.review);
	}
	
	@Override
	public String toString() {
		
		StringBuilder rating = new StringBuilder();
		
		if(stars != 0) {
			for(int i = 0; i < this.stars; i++) {
				rating.append("★");
				if(i == this.stars -1) rating.append("\n\n");
			}
		}
		
		if(review != null) {
			rating.append("Review: " + "\"" + this.review + "\"" + ("\n\n"));
		}
		return rating.toString();
	}
}
