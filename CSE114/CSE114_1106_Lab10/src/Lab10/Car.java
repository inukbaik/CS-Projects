package Lab10;

public class Car extends Vehicle {
	private String whatAmI;
	private String mySound;
	
	public String whatAreYou() {
		return whatAmI;
	}
	
	public String speak() {
		return mySound;
	}
	
	public Car() {
		whatAmI = "Car";
		mySound = "Vroom..";
	}
}
