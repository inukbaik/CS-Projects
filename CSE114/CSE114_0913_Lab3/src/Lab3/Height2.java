package Lab3;

import java.util.Scanner;

public class Height2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner (System.in);
		
		System.out.print("Enter height 1 feet: ");
		int feet1 = console.nextInt();
		
		System.out.print("Enter height 1 inches: ");
		int inches1 = console.nextInt();
		
		System.out.print("Enter height 2 feet: ");
		int feet2 = console.nextInt();
		
		System.out.print("Enter height 2 inches: ");
		int inches2 = console.nextInt();
		
		int value = (inches1 + inches2) / 12;
		int feet3 = feet1 + feet2 + value;
		int inches3 = (inches1 + inches2) % 12;
		
		
		
		System.out.println("feet 1 = " + feet1 + " inches 1 = " + inches1);
		
		System.out.println("feet 2 = " + feet2 + " inches 2 = " + inches2);
		
		System.out.println("feet 3 = " + feet3 + " inches 3 = " + inches3 + " (result)");
		
		console.close();
	}
}