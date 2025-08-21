package Java_Package;

interface Animal {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		System.out.println("Zzz");
	}
}

public class Interface_Example {
	
	
		public static void main(String[] args) {
			// Example of Interface
			Animal myPig = new Pig();
			//Pig myPig = new Pig();
			myPig.animalSound();
			myPig.sleep();
		

	}
}
	
