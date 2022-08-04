package CSE114_0905;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Initialize sum, count, & avg
		int sum = 0;
		int count = 0;
		double average = 0.0;
		
		//Read Filename
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the filename:");
		String filename = console.nextLine();
		console.close();
		
		//Open File
		File infile = new File(filename);
		Scanner indata = new Scanner(infile);
		
		//Loop
		while (indata.hasNextInt()) {
			int tempint = indata.nextInt();
			sum += tempint;
			count++;
			
		}
		//Print Sum, Print Avg
		average = ((double) sum) / count;
			System.out.println("Sum=" + sum);
			System.out.println("Average=" + average);
			indata.close();
			
		
		
	}

}
