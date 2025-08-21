package Java_Package;

public class Static_Method_Example {
	static void myMethod() {
	    System.out.println("Method called Inside the main");
	  }

	public void myNewMethod() {
	    System.out.println("This is New Method called Inside the main");
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Called method inside the main to execute them
		  myMethod();
		  Static_Method_Example obj = new Static_Method_Example();
		  obj.myNewMethod();
		  //myNewMethod();
		  // Direct Print Statement
		  System.out.println("Hello World!");
	}

}
