package Lab10;

public class Motorcycle extends Vehicle {
	private String whatAmI;
	private String mySound;
	
	public String whatAreYou() {
		return whatAmI;
	}
	
	public String speak() {
		return mySound;
	}
	
	public Motorcycle() {
		whatAmI = "Motorcycle";
		mySound = "Zoom!";
	}
}
