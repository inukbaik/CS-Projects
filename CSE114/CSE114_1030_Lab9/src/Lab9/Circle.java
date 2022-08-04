package Lab9;

//Name: Inuk Baik
//SBU ID: 112493042
//Email: inuk.baik@stonybrook.edu

public class Circle {
	private double x;
	private double y;
	private double r;
	
	public Circle(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	public Circle(double r){
		x = 0;
		y = 0;
		this.r = r;
		
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getR() {
		return r;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	public boolean equals(Circle other) {
		if(other == this) {
			return true;
		}
		double eps = 0.00001;
		return (Math.abs(x - other.x) < eps)
				&& (Math.abs(y - other.y) < eps)
				&& (Math.abs(r - other.r) < eps);
	}
	
	public String toString() {
		return "Circle: (" + this.x + ", " + this.y + ") with radius " + this.r;
	}
}
