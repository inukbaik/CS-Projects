package Lab7;

class UseFlexibleCircle {

	public static boolean floatEquals(double v1, double v2) {
		double eps = 0.00001;
		return (Math.abs(v1 - v2) < eps);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlexibleCircle c1 = new FlexibleCircle(25.0); // Circle with 25 for radius
		FlexibleCircle c2 = new FlexibleCircle(25.0, 'A'); // Circle with 25 for area
		FlexibleCircle c3 = new FlexibleCircle(25.0, 'P'); // Circle with 25 for perimeter
		FlexibleCircle c4 = new FlexibleCircle(10.0, 'a'); // Circle with 10 for area
		FlexibleCircle c5 = new FlexibleCircle(10.0, 'p'); // Circle with 10 for perimeter
		FlexibleCircle c6 = new FlexibleCircle(25.0, 'x'); // Invalid circle
		FlexibleCircle c7 = new FlexibleCircle(1.7841241161527712); // Circle with 1.78412 for radius
		
		System.out.println("c1 area, perimeter, radius = " + c1.getArea() + ", " + c1.getPerimeter() + ", " + c1.getRadius());
		System.out.println("c2 area, perimeter, radius = " + c2.getArea() + ", " + c2.getPerimeter() + ", " + c2.getRadius());
		System.out.println("c3 area, perimeter, radius = " + c3.getArea() + ", " + c3.getPerimeter() + ", " + c3.getRadius());
		System.out.println("c4 area, perimeter, radius = " + c4.getArea() + ", " + c4.getPerimeter() + ", " + c4.getRadius());
		System.out.println("c5 area, perimeter, radius = " + c5.getArea() + ", " + c5.getPerimeter() + ", " + c5.getRadius());
		System.out.println("c6 area, perimeter, radius = " + c6.getArea() + ", " + c6.getPerimeter() + ", " + c6.getRadius());

		System.out.println("Test cases: ");

		System.out.print("   Test Case 1:");
		if (floatEquals(c1.getArea(), 1963.49540)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
	
		System.out.print("   Test Case 2:");
		if (floatEquals(c1.getPerimeter(), 157.07963)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
	
		System.out.print("   Test Case 3:");
		if (floatEquals(c2.getArea(), 24.999999)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
	
		System.out.print("   Test Case 4:");
		if (floatEquals(c2.getPerimeter(), 17.72453)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 5:");
		if (floatEquals(c2.getRadius(), 2.820947)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
	
		System.out.print("   Test Case 6:");
		if (floatEquals(c3.getArea(), 49.735919)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		
		System.out.print("   Test Case 7:");
		if (floatEquals(c3.getPerimeter(), 25.0)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}

		System.out.print("   Test Case 8:");
		if (floatEquals(c3.getRadius(), 3.97887)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 9:");
		if (floatEquals(c4.getArea(), 10.0)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 10:");
		if (floatEquals(c4.getPerimeter(), 11.20998)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 11:");
		if (floatEquals(c4.getRadius(), 1.784124)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		
		System.out.print("   Test Case 12:");
		if (floatEquals(c5.getArea(), 7.95774)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 13:");
		if (floatEquals(c5.getPerimeter(), 10.0)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 14:");
		if (floatEquals(c5.getRadius(), 1.59154)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		
		System.out.print("   Test Case 15:");
		if (floatEquals(c6.getArea(), 1963.49540)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 16:");
		if (floatEquals(c6.getPerimeter(), 157.079632)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 17:");
		if (floatEquals(c6.getRadius(), 25.0)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		
		System.out.print("   Test Case 18:");
		if (floatEquals(c7.getPerimeter(), 11.20998)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		
		c6.setArea(25.0);
		System.out.println(" Area set to 25.0");
		System.out.print("   Test Case 19:");
		if (floatEquals(c6.getArea(), 25.0)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 20:");
		if (floatEquals(c6.getPerimeter(), 17.72453)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 21:");
		if (floatEquals(c6.getRadius(), 2.82094)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		
		c6.setPerimeter(10.0);
		System.out.println(" Perimeter set to 10.0");
		System.out.print("   Test Case 22:");
		if (floatEquals(c6.getArea(), 7.95774)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 23:");
		if (floatEquals(c6.getPerimeter(), 10.0)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
		System.out.print("   Test Case 24:");
		if (floatEquals(c6.getRadius(), 1.59154)) {
			System.out.println("   passed");
		} else {
			System.out.println("   failed");			
		}
	}
}