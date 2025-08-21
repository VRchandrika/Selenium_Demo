package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File_Data_Example {
	public static void fileread() throws FileNotFoundException
	{
	      File myObj = new File("NewFile.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	}

	public static void main(String[] args) throws FileNotFoundException {
	    File myObj = new File("filename.txt");
	    if (myObj.exists()) {
	      System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	    //Calling FileRead method 
		fileread();
		  
	  }

}
