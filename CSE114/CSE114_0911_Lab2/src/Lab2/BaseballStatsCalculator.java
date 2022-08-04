package Lab2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * BaseballStatsCalculator is a program that can be used
 * to calculate a pitcher's ERA and a hitter's batting average.
 * 
 * @author Richard McKenna
 * @author Your Name Here
 */
public class BaseballStatsCalculator 
{
	/**
	 * Here is our program. Remember, all Java programs
	 * start execution on the first line of a main method.
	 */
	public static void main(String[] args) 
	{
		// THIS VARIABLE WILL HELP US GET USER INPUT
		Scanner keyboard = new Scanner(System.in);
		String input;

		// LET'S CALCULATE A PITCHER'S ERA (Earned Run Average)
		// FIRST LET'S DECLARE ALL THE VARIABLES WE WISH TO USE
		double ip; 	// INNINGS PITCHED
		double er; 	// EARNED RUNS
		double era; // EARNED RUN AVERAGE
		
		System.out.println("*** WELCOME TO THE BASEBALL STATS CALCULATOR ***");
		System.out.println("\nFIRST LET'S CALCULATE A PITCHER'S ERA");
		
		// PROMPT THE USER FOR IP
		System.out.print("Enter the Pitcher's Innings Pitched (IP): ");		
		input = keyboard.nextLine();
		ip = Double.parseDouble(input);

		// PROMPT THE USER FOR ER
		System.out.print("Enter the Pitcher's Earned Runs Allowed (ER): ");	
		input = keyboard.nextLine();
		er = Double.parseDouble(input);
		
		// CALCULATE ERA
		era = 9.0 * (er / ip);
		
		// WE'LL USE A NumberFormat OBJECT TO FORMAT OUR OUTPUT
		// WE'LL MAKE SURE TO ALWAYS DISPLAY 2 DIGITS PAST THE DECIMAL POINT
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		
		// NOW LET'S OUTPUT THE RESULTS
		System.out.println("ERA: " + nf.format(era));
		
		// ADD CODE HERE TO CALCULATE A HITTER'S BATTING AVERAGE
		// FOLLOWING THE SAME PATTERN USED ABOVE
		
		
		System.out.println(" ");	//I added this string to make a space between pitcher's stuff and batter's stuff
		
		
		// DECLARE YOUR NUMERIC VARIABLES
		double ab;	//AT BATS
		double hits; //HITS
		double ba;	//BATTING AVERAGE
		
		System.out.println("AND, LET'S CALCULATE A BATTER'S BATTING AVERAGE");
		// PROMPT AND GET INPUT FROM THE USER
		System.out.print("Enter the Batter's At Bat (AB): ");
		input = keyboard.nextLine();
		ab = Double.parseDouble(input);
		
		System.out.print("Enter the Batter's Hits: ");
		input = keyboard.nextLine();
		hits = Double.parseDouble(input);
		
		// CALCULATE YOUR RESULTS
		ba = hits / ab ;
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMinimumFractionDigits(3);
		nf2.setMaximumFractionDigits(3);
		
		// OUTPUT THE RESULTS PROPERLY FORMATTED WITH
		// 3 DECIMAL DIGITS TO THE RIGHT OF THE DECIMAL POINT
		System.out.println("BATTING AVERAGE: " + nf2.format(ba));
	}
}

