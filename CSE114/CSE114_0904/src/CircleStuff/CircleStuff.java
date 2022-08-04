package CircleStuff;

import java.util.Scanner;

public class CircleStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a radius
		
		System.out.println("Enter a radius:");
		
		radius = input.nextDouble();
		
		System.out.println("radius=" + radius);
		double area = Math.PI * radius * radius;
		
		System.out.println("area = " + area);
		
		input.close();
		
	}

}
