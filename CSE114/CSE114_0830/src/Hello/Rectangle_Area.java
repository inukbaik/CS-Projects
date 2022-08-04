package Hello;

import java.util.Scanner;

public class Rectangle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter lenght of side1: ");
		int theFirstSide = input.nextInt();
		
		System.out.println("Enter lenght of side2: ");
		int theSecondSide = input.nextInt();
		
		int theArea = calculateArea(theFirstSide, theSecondSide);
		
		System.out.println("The area is: " + theArea);
		input.close();
	}
	
	public static int calculateArea(int side1, int side2) {
		int area;
		
		area = side1 * side2;
		
		return area;
	}

}
