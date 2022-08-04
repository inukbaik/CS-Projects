package Assignment_4;

public class TestGeometry {

	public static void main(String[] args) {
		Point cp1 = new Point(0,0);
		Point cp2 = new Point(10, 10);
		Point cp3 = new Point(20, 20);
		Point cp4 = new Point(54, 11);
		Point cp5 = new Point(32, 1);
		Point cp6 = new Point(65, 16);
		// (94, 3), (1, 19), (10, 444)
		Point cp7 = new Point(94, 3);
		Point cp8 = new Point(1, 19);
		Point cp9 = new Point(10,444);
		System.out.println("isCollinear test cases");
		boolean r1 = cp1.isCollinear(cp2, cp3);
		System.out.print("   Test case 1: (0,0), (10, 10), (20, 20)     :");
		System.out.println(r1 == true ? "Passed" : "Failed");
		boolean r2 = cp2.isCollinear(cp1,  cp3);
		System.out.print("   Test case 2: (10, 10), (0,0), (20, 20)     :");
		System.out.println(r2 == true ? "Passed" : "Failed");
		boolean r3 = cp2.isCollinear(cp2,  cp2);
		System.out.print("   Test case 3: (10, 10), (10, 10), (10, 10)  :");
		System.out.println(r3 == true ? "Passed" : "Failed");
		boolean r4 = cp4.isCollinear(cp5,  cp6);
		System.out.print("   Test case 4: (54, 11), (32, 1), (65, 16)   :");
		System.out.println(r4 == true ? "Passed" : "Failed");
		boolean r5 = cp7.isCollinear(cp8,  cp9);
		System.out.print("   Test case 5: (94, 3), (1, 19), (10,444)    :");
		System.out.println(r5 == false ? "Passed" : "Failed");
		
		System.out.println("Collinear results:" );
		System.out.println("r1=" + r1);
		System.out.println("r2=" + r2);
		System.out.println("r3=" + r3);
		System.out.println("r4=" + r4);
		System.out.println("r5=" + r5);
		
		
		
		Point p1 = new Point(23, 10);
		Point p2 = new Point(3, 3);
		Rectangle myRect1 = p1.buildRectangle(p2);
		Point p3 = new Point(5, 7);
		Point p4 = new Point(20, 20);
		Rectangle myRect2 = p3.buildRectangle(p4);
		Rectangle myRect3 = p4.buildRectangle(p3);
		
		System.out.println("Point 1: (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("Point 2: (" + p2.getX() + ", " + p2.getY() + ")");
		System.out.println("Point 3: (" + p3.getX() + ", " + p3.getY() + ")");
		System.out.println("Point 4: (" + p4.getX() + ", " + p4.getY() + ")");
		System.out.println("Rectangles test cases: ");
		System.out.print("   Test case 1: ");
		if (myRect1.getX() == 3 && myRect1.getY() == 10 && myRect1.getWidth() == 20 && myRect1.getHeight() == 7) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		myRect1.printRectangle();
		System.out.print("   Test case 2: ");
		if (myRect2.getX() == 5 && myRect2.getY() == 20 && myRect2.getWidth() == 15 && myRect2.getHeight() == 13) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		myRect2.printRectangle();
		System.out.print("   Test case 3: ");
		if (myRect3.getX() == 5 && myRect3.getY() == 20 && myRect3.getWidth() == 15 && myRect3.getHeight() == 13) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		myRect3.printRectangle();
		
	}

}


