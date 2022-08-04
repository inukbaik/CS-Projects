package Lab10;

public class Racecar extends Car {
	private String whatAmI;
	private String mySound;
	
	public String whatAreYou() {
		return whatAmI;
	}
	
	public String speak() {
		return mySound;
	}
	
	public Racecar() {
		whatAmI = "...(Racecar)";
		mySound = "Ziiip...";
	}
}
