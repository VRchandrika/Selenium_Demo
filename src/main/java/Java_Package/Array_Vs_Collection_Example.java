package Java_Package;

import java.util.ArrayList;

public class Array_Vs_Collection_Example {
	
	public static void main(String[] args)
    {
 
        // Arrays
        String[] gfg
            = new String[] { "G", "E", "E", "K", "S" };
 
        // Trying printing the above array
        System.out.println(gfg);
 
        // New Line
       System.out.println();
 
        // Collection
        // Let us arbitarly create an empty ArrayList
        // of string type
        ArrayList<String> al = new ArrayList<String>();
 
        // Adding elements to above List
        // using add() method
        al.add("g");
        al.add("e");
        al.add("e");
        al.add("k");
        al.add("s");
 
        // Printing all elements of Collection (ArrayList)
        System.out.println(al);
}
}
