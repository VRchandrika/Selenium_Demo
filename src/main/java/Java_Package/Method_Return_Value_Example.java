package Java_Package;

public class Method_Return_Value_Example {
	 static int Addition(int x, int y) {
		    return x + y;
		  }
	 
	 static double Additionfloat(int x, double d) {
		    return x + d;
		  }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = Addition(10, 3);
	    double f = Additionfloat(10,10.55);
	    System.out.println(z);
	    System.out.println(f);
	  
	}

}
