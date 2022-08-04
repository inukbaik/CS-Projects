package Lab9;

//Name: Inuk Baik
//SBU ID: 112493042
//Email: inuk.baik@stonybrook.edu

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(3.0, 7.0, 7.5);
		Circle c2 = new Circle(3.0, 7.0, 7.5);
		Circle c3 = new Circle(10.5);
		Circle c4 = new Circle(0.0, 0.0, 10.5);
		Circle c5 = new Circle(7.5);
		
		System.out.println("c1.x, c1.y = " + c1.getX() + ", " + c1.getY());
		System.out.println("c3.x, c3.y = " + c3.getX() + ", " + c3.getY());
		System.out.println("c4.r = " + c4.getR());
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);
		
		System.out.println("c1 == c1? => " + (c1 == c1));
		System.out.println("c1 == c2? => " + (c1 == c2));
		System.out.println("c3 == c4? => " + (c3 == c4));
		System.out.println("c2 == c5? => " + (c2 == c5));

		System.out.println("c1.equals(c1)? => " + c1.equals(c1));
		System.out.println("c1.equals(c2)? => " + c1.equals(c2));
		System.out.println("c3.equals(c4)? => " + c3.equals(c4));
		System.out.println("c2.equals(c5)? => " + c2.equals(c5));
		System.out.println("Set c4.r to 7.5");
		c4.setR(7.5);
		System.out.println("c3.equals(c4)? => " + c3.equals(c4));

	}

}
