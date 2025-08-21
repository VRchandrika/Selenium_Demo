package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_to_a_File {
	public static void main(String[] args) throws IOException {
	      FileWriter myWriter = new FileWriter("NewFile.txt");
	      myWriter.write("Welcome to Selenium File Concept!");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	      //Create Object of the Class and access the Method.
	      Read_File_Data_Example obj = new Read_File_Data_Example();
	      obj.fileread();
	  }

}
