package books;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class Files {

	static String[] monthName = {"January", "February",
            "March", "April", "May", "June", "July",
            "August", "September", "October", "November",
            "December"};
	static Calendar cal = Calendar.getInstance();
	private static final String MONTH = monthName[cal.get(Calendar.MONTH)];
	private static final int YEAR = cal.get(Calendar.YEAR);
	private static final String USER = System.getProperty("user.name");
	private static final String PATH ="/Users/" + USER + "/book_logs/";
	static final String SUBPATH = PATH + MONTH + "-" + YEAR + "/";
	
	static File main_folder = new File(PATH);
	
	static File sub_folder = new File(SUBPATH);
	
	/**
	 * Looks to see if the directory /book_logs has been created. If not, the directory is created
	 * in the user's home directory. Then does the same for sub-directory of current month/year.
	 */
	public static void make_dirs() {
		
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
	
	/**
	 * Creates file that contains book object, stores in sub-directory for current month/year
	 * @param entry, the book to be logged
	 */
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
	
	//NEED METHODS TO REMOVE, DISPLAY, AND COUNT BOOKS.
}
