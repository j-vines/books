package books;

/**
 * 
 * @author Jack Vines
 * @version 0.1
 * Last updated: 8/27/19
 * 
 * Creates a "log" or series of files containing book objects that the user will be able to add
 * to and search through.
 */

public class Main {
	
	public static void main(String[] args) {
		
		/* create book_logs directory for first-time user*/
		Files.make_dirs();
		
		GUI.startUp();
	}

}
