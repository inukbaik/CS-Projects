package Lab10;

public class Vehicle {
	private String whatAmI;
	private String mySound;
	
	public Vehicle() {
		whatAmI = "Vehicle";
		mySound = "Ummm, having a bit of an identity crisis!";
	}
	
	public String whatAreYou() {
		return whatAmI;
	}
	
	public String speak() {
		return mySound;
	}
}
