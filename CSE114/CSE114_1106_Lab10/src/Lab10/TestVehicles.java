package Lab10;

public class TestVehicles {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		Car rc1 = new Racecar();
		Motorcycle m1 = new Motorcycle();
		
		System.out.println("v1: ");
		System.out.println("   This is a " + v1.whatAreYou());
		System.out.println("   It says " + v1.speak());
		System.out.println("c1: ");
		System.out.println("   This is a " + c1.whatAreYou());
		System.out.println("   It says " + c1.speak());
		System.out.println("rc1: ");
		System.out.println("   This is a " + rc1.whatAreYou());
		System.out.println("   It says " + rc1.speak());
		System.out.println("m1: ");
		System.out.println("   This is a " + m1.whatAreYou());
		System.out.println("   It says " + m1.speak());

	}

}
