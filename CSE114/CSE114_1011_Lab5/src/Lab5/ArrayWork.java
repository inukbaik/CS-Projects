package Lab5;
//
// Name: Inuk Baik
// SBU ID: 112493042
// Email: inuk.baik@stonybrook.edu
//

public class ArrayWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {8, 3, 5, 7, 2, 4};
		int[] a2 = {15, 22, 8, 19, 31};
		int[] a3 = {32};
		int[] a4 = {10, -30, 100001, 14, 100002, -32};
		
		int[] l1 = {20, 30, -10, 84, 14, 105, 15, 21, 19, 105, -10, 30, 11};
		
		// Test Cases
		System.out.println("LastIndexOf test cases:");
		int lio_result;
		// lastIndexOf case 1
		System.out.print("   Test case 1: ");
		lio_result = lastIndexOf(l1, 20);
		if (lio_result == 0) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		// lastIndexOf case 2
		System.out.print("   Test case 2: ");
		lio_result = lastIndexOf(l1, 30);
		if (lio_result == 11) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	
		// lastIndexOf case 3
		System.out.print("   Test case 3: ");
		lio_result = lastIndexOf(l1, 19);
		if (lio_result == 8) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	
		// lastIndexOf case 4
		System.out.print("   Test case 4: ");
		lio_result = lastIndexOf(l1, -10);
		if (lio_result == 10) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		// lastIndexOf case 5
		System.out.print("   Test case 5: ");
		lio_result = lastIndexOf(l1, 59);
		if (lio_result == -1) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		// Test Cases
		System.out.println("range test cases:");
		int range_result;
		
		// case 1
		// range case 1
		range_result = range(a1);
		System.out.print("   Test case 1: ");
		if (range_result == 7) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

		range_result = range(a2);
		System.out.print("   Test case 2: ");
		if (range_result == 24) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		
		range_result = range(a3);
		System.out.print("   Test case 3: ");
		if (range_result == 1) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		
		range_result = range(a4);
		System.out.print("   Test case 4: ");
		if (range_result == 100035) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		
		
	}
	
	//
	// Important note: Do NOT alter any test case code above this line!
	//
	// Define the range() method here
	public static int range(int[] exampleArray) {
		int max = exampleArray[0];
		int min = exampleArray[0];
		int range;
		
		for(int i = 1; i < exampleArray.length; i++) {
			if(exampleArray[i] > max) {
				max = exampleArray[i];
			}
			if(exampleArray[i] < min) {
				min = exampleArray[i];
			}
		}
		range = max - min + 1;
		return range;
	}
	
	// Define the lastIndexOf() method here
	public static int lastIndexOf(int[] newArray, int value) {
		int index = -1;
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] == value) {
				index = i;
			}
		}
		return index;
	}
}
