package Java_Package;

public class Bank {//webdriver

	int getRateOfInterest() {
		return 5;
	}

	static String getBankName() {
		return "RBI";
	}

}

// Creating child classes.
class SBI extends Bank  {
	int getRateOfInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}
class HDFC extends Bank {
//		int getRateOfInterest() {
//			return 9;
//		}

}
