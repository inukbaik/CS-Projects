package Assignment_4;

//
//Name: Inuk Baik
//SBU ID: 112493042
//Email: inuk.baik@stonybrook.edu
//
public class Point {
	private int x;
	private int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isCollinear(Point p1, Point p2) {
		if((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
			return true;
		}else {
			double slope1 = (double)(p1.y - this.y) / (double)(p1.x - this.x);
			double slope2 = (double)(p2.y - this.y) / (double)(p2.x - this.x);
			double eps = 0.00001;
			return (Math.abs(slope1 - slope2) < eps);
		}
	}
	
	public Rectangle buildRectangle(Point p2) {
		int pointX;
		int pointY;
		
		if(this.x < p2.getX()) {
			pointX = this.x;
		}else {
			pointX = p2.getX();
		}
		
		if(this.y < p2.getY()) {
			pointY = p2.getY();
		}else {
			pointY = this.y;
		}
		
		int width = Math.abs(this.x - p2.getX());
		int height = Math.abs(this.y - p2.getY());
		
		Rectangle rectangle = new Rectangle(pointX, pointY, width, height);
		return rectangle;
	}
}
