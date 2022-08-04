package Square_Area;

import java.util.Scanner;

public class Square_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter lenght of side: ");
		int theSide = input.nextInt();
		
		
		int theArea = calculateArea(theSide);
		
		System.out.println("The Square area is: " + theArea);
		input.close();
	}
	
	public static int calculateArea(int side) {
		int area;
		
		area = side * side;
		
		return area;
	}

}

