package fileIOStream;

import java.io.File;
import java.io.IOException;

public class FileReader {

	public static void main(String[] args) {

		/*
		 * File file = new File("C:\\Users\\ELCOT\\Desktop\\siva\\davitha\\pappa");
		 * boolean present = file.exists(); System.out.println("folder present "
		 * +present);
		 * 
		 * if (present == false)
		 * 
		 * file.mkdirs(); present = file.exists(); System.out.println("folder present "+
		 * present);
		 * 
		 */
		/*
		 * File file = new
		 * File("C:\\Users\\ELCOT\\Desktop\\siva\\davitha\\pappa\\test.txt"); boolean
		 * present = file.exists(); if (present == false) try { boolean created =
		 * file.createNewFile(); System.out.println("file is created " + created); }
		 * catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		File file11 = new File("C:\\Users\\ELCOT\\Desktop\\siva\\davitha\\pappa\\test.txt");
		file11.delete();
		boolean ispresent = file11.exists();
		System.out.println(ispresent);
	}
}