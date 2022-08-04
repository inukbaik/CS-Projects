package Assignment_4;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void printRectangle() {
		System.out.println("Rectangle: upper left corner (" + x + ", " + y + ") width = " + width + ", height = " + height);
	}
	public int getX() { return x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
}
