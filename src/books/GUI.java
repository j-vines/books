package books;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;

public class GUI {
	
	/**
	 * Opens the application window
	 */
	public static void startUp() {
		JFrame frame = new JFrame("Digital Book Log");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600,800);
	    frame.setVisible(true);
	}
	
}
