package Lab11;

//
//Name : Inuk Baik
//SBU ID: 112493042
//Email : inuk.baik@stonybrook.edu
//

public class Rectangle implements GeoSerializable {
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
	
	public Rectangle() {
		x = 0;
		y = 0;
		width = 0;
		height = 0;
	}
	public String toString() {
		return "Rectangle: upper left corner (" + x + ", " + y + ") width = " + width + ", height = " + height;
	}

	public void printRectangle() {
		System.out.println("Rectangle: upper left corner (" + x + ", " + y + ") width = " + width + ", height = " + height);
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }

	public String serialize() {
		return "Rectangle x " + x + " y " + y + " width " + width + " height " + height;
	}

	public void deserialize(String objectData) {
		String [] parse = objectData.split(" ");
		if(parse[0].equals("Rectangle")) {
			if(parse[1].equals("x") &&
					parse[3].equals("y")) {
				this.x = Integer.parseInt(parse[2]);
				this.y = Integer.parseInt(parse[4]);
				this.width = Integer.parseInt(parse[6]);
				this.height = Integer.parseInt(parse[8]);
				}
			}else {
				System.out.println("deserialize(); bad data.");
		}		
	}
}