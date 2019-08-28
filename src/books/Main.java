package books;

import java.io.File;

public class Main {
	
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
		
		
	}

}
