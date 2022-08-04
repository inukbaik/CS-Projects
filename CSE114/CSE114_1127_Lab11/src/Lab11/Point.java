package Lab11;

//
//Name: Inuk Baik
//SBU ID: 112493042
//Email: inuk.baik@stonybrook.edu
//
public class Point implements GeoSerializable {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point () {
		x = 0;
		y = 0;
	}
	
	public String toString() {
		return "Point: (" + x + ", " + y + ")";
	}
	public String serialize() {
		return "Point x " + x + " y " + y;
	}
	public void deserialize(String objectData) {
		String [] parse = objectData.split(" ");
		if(parse[0].equals("Point")) {
			if(parse[1].equals("x")&&
					parse[3].equals("y")) {
				this.x = Integer.parseInt(parse[2]);
				this.y = Integer.parseInt(parse[4]);
			}
		} else {
			System.out.println("deserialize(); bad data."); 
		}
	}	
}