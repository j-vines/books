package books;

import java.io.File;

/**
 * 
 * @author Jack Vines
 * @version 0.1
 * Last updated: 8/27/19
 * 
 * Creates a "log" or series of files containing book objects that the user will be able to add
 * to and search through. Built for Mac.
 */

public class Main {
	
	/**
	 * Looks to see if the directory /book_logs has been created. If not, the directory is created
	 * in the user's home directory.
	 * @return true if the directory is created. Otherwise, return false.
	 */
	public static boolean make_dir() {
		
		String user = System.getProperty("user.name");
		
		File folder = new File("/Users/" + user + "/book_logs");
	    	if (!folder.exists()) {
	    		if (folder.mkdir()) {
	    			return true;
	    		}
	    	}
	    return false;
	}
	
	public static void main(String[] args) {
		
		/* create book_log directory for first-time user*/
		if(!make_dir()) {
			System.out.println("Directory already exists!");
		} else System.out.println("Directory created!");
		
		/*prompt user to enter new book, or search for previously logged book*/
		
		//TESTING
		Rating rate1 = new Rating(4, "Good stuff!");
		Rating rate2 = new Rating(1, "This book was terrible.");
		Rating rate3 = new Rating(0, "Literally unreadable!");
		Rating rate4 = new Rating(3);
		
		Book book1 = new Book("Harry Potter", new String[] {"J.K Rowling"}, "2018", rate1);
		Book book2 = new Book("The Bible", new String[] {"Guy Ritchie", "Steve McQueen", "Joseph Gordon Levitt"}, "1994", rate3);
		
		System.out.println(book1);
		System.out.println(book2);
		
	}

}
