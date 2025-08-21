package Java_Package;

public class Method_Overriding_Example extends Bank{
	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		HDFC h = new HDFC();
		System.out.println("HDFC Rate of Interest: " + h.getRateOfInterest());
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("Bank Name: " + SBI.getBankName());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
		// Suppose user want to use main RBI interest rate then below example
		Method_Overriding_Example m = new Method_Overriding_Example();
		System.out.println("Bank Rate of Interest: " + m.getRateOfInterest());
	}
}
