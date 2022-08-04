package Lab11;

public class TestGeoSaver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(3, 5);
		Point p2 = new Point();
		Point p3 = new Point();
		
		Rectangle r1 = new Rectangle(10, 15, 15, 5);
		Rectangle r2 = new Rectangle();
			
		String p1Ser = p1.serialize();
		String r1Ser = r1.serialize();
		
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);

		System.out.println("p1Ser = " + p1Ser);
		System.out.println("r1Ser = " + r1Ser);

		System.out.println("Deserializing");
		p2.deserialize(p1Ser);
		r2.deserialize(r1Ser);
		System.out.println("p2: " + p2);
		System.out.println("r2: " + r2);
		System.out.println("Deserializing Rectangle into p3");
		p3.deserialize(r1Ser);
		System.out.println("p3: " + p3);
	}

}
