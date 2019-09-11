package books;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

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
	
	private static final String USER = System.getProperty("user.name");
	private static final String PATH ="/Users/" + USER + "/book_logs/";
	static String[] monthName = {"January", "February",
            "March", "April", "May", "June", "July",
            "August", "September", "October", "November",
            "December"};
	static Calendar cal = Calendar.getInstance();
	private static final String MONTH = monthName[cal.get(Calendar.MONTH)];
	private static final int YEAR = cal.get(Calendar.YEAR);
	private static final String SUBPATH = PATH + MONTH + "-" + YEAR + "/";
	
	public static void log_book(Book entry) {
		 
        try {
            FileOutputStream fileOut = new FileOutputStream(SUBPATH + entry.getTitle());
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(entry);
            objectOut.close();
            System.out.println("Book was logged!");
 
        } catch (Exception ex) {
            System.out.println("ERROR: Book could not be logged...");
        }
    }
	
	
	/**
	 * Looks to see if the directory /book_logs has been created. If not, the directory is created
	 * in the user's home directory. Then does the same for sub-directory of current month/year.
	 */
	public static void make_dirs() {
		
		File main_folder = new File(PATH);
		File sub_folder = new File(SUBPATH);
		
	    	if (!main_folder.exists()) {
	    		if (main_folder.mkdir()) {
	    			System.out.println("Directory: book_log was created!");
	    		}
	    	}
	    	
	    	if (!sub_folder.exists()) {
				if (sub_folder.mkdir()) {
					System.out.println("Sub-directory: " + MONTH + "-" + YEAR + " was created!");
				}
			}
	}
	
	public static void main(String[] args) {
		
		/* create book_logs directory for first-time user*/
		make_dirs();
		
		/*prompt user to enter new book, or search for previously logged book*/
		
		//TEST book_log()
		Rating rate1 = new Rating(5, "Pretty Good!");
		Rating rate2 = new Rating(1, "Terrible");
		Book book1 = new Book("Harry Potter", new String[] {"Jimmy Olsen"}, "2018", rate1);
		Book book2 = new Book("The Bible", new String[] {"Mark Robertson", "Terry Owens"}, "1994", rate2);
		
		log_book(book1);
		log_book(book2);
		
		GUI.startUp();
	}

}
