package Java_Package;

public class Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		
		//To Add the value in Array List
		cars[1] = "Opel";
		System.out.println(cars[1]);

		//To count the length of Arrays List
		System.out.println(cars.length);
		// Using For loop by help of length
		for (int i = 0; i < cars.length; i++) 
		{
			  System.out.println(cars[i]);
			}
		
		// By using for each loop
		
		for (String i : cars) {
			  System.out.println(i);
			}

	}

}
