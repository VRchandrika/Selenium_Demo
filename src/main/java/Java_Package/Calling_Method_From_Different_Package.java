package Java_Package;

import java.io.FileNotFoundException;

import File_Handling.Read_File_Data_Example;

public class Calling_Method_From_Different_Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Read_File_Data_Example obj = new Read_File_Data_Example();
	      try {
			obj.fileread();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
          
            // Finally block
            System.out.println("Finally block executed");
        }
	}

}