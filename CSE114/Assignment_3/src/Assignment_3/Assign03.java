package Assignment_3;

//
// Name: Inuk Baik
// SBU ID: 112493042
// Email: inuk.baik@stonybrook.edu
//
public class Assign03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {14, 1, 22, 17, 36, 7, -43, 5};
		int b1 = 17;
		int b2 = 4;
		int[] a2 = {14, -1, 22, 17, 36, 7, -43, 5, -105, 210, 41, 59, 63};
		int b3 = -1;
		int b4 = 100;
		
		int[][] A1 = {{2, 15, 35, 4, 5}, {4, -1, 20, 17, -4}, {44, 1, 21, -5, 11}, {2, 4, 6, 8, 10}};
		int[][] B1 = {{4, 20, -5, 10, 4}, {3, 3, -3, -3, 4}, {22, 10, -20, 10, 11}, {4, 5, 6, -1, -2}};
		int[][] B2 = {{4, 20, -5, 10, 4, 7}, {3, 3, -3, -3, 4, 10}, {22, 10, -20, 10, 11, 6}, {4, 5, 4, 6, -1, -2}};
		int[][] eResult1 = {{6, 35, 30, 14, 9}, {7, 2, 17, 14, 0}, {66, 11, 1,  5, 22}, {6, 9, 12,  7,  8}};
		int[][] eResult2 = {{-1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1}, 	{-1, -1, -1, -1, -1}};
		
		// countInRange test cases
		int cir_result;
		System.out.println("countInRange() test cases");
		// countInRange test case 1
		System.out.print("   Test Case 1: ");
		cir_result = countInRange(a1, b1, b2);
		System.out.print(cir_result + " ");
		if (cir_result == 4) {
			System.out.println("passed.");
		} else {
			System.out.println("failed.");
		}
		System.out.print("   Test Case 2: ");
		cir_result = countInRange(a1, b2, b1);
		System.out.print(cir_result + " ");
		if (cir_result == 4) {
			System.out.println("passed.");
		} else {
			System.out.println("failed.");
		}
		

		System.out.print("   Test Case 3: ");
		cir_result = countInRange(a2, b3, b4);
		System.out.print(cir_result + " ");
		if (cir_result == 10) {
			System.out.println("passed.");
		} else {
			System.out.println("failed.");
		}
		
		System.out.print("   Test Case 4: ");
		cir_result = countInRange(a2, b4, b3);
		System.out.print(cir_result + " ");
		if (cir_result == 10) {
			System.out.println("passed.");
		} else {
			System.out.println("failed.");
		}

		int[][] ms1 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
		int[][] ms2 = {{1, 14, 4, 15}, {8, 11, 5, 10}, {13, 2, 16, 3}, {12, 7, 9, 6}};
		int[][] ms3 = {{1, 14, 4, 15}, {8, 11, 5, 10}, {12, 2, 16, 3}, {13, 7, 9, 6}};
		int[][] ms4 = {{2, 7, 6}, {9, 1, 5}, {4, 3, 8}};

		boolean isMsResult;

		System.out.println("isMagicSquare() test cases");
		System.out.print("   Test case 1 ");
		isMsResult = isMagicSquare(ms1);
		if (isMsResult == true) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		
		System.out.print("   Test case 2 ");
		isMsResult = isMagicSquare(ms2);
		if (isMsResult == true) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	
		System.out.print("   Test case 3 ");
		isMsResult = isMagicSquare(ms3);
		if (isMsResult == false) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	
		System.out.print("   Test case 4 ");
		isMsResult = isMagicSquare(ms4);
		if (isMsResult == false) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
	
		System.out.println("matrixAdd Test Cases");
		int[][] codeResult;
		codeResult = matrixAdd(A1, B1);
		System.out.print("   Test case 1: ");
		boolean iPassed = true;
		for (int i = 0; i < A1.length; i++) {
			for (int j = 0; j < A1[0].length; j++) {
				if (codeResult[i][j] != eResult1[i][j]) {
					iPassed = false;
					break;
				}
			}
		}
		if (iPassed) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}		
		iPassed = true;
		
		codeResult = matrixAdd(A1, B2);
		System.out.print("   Test case 2: ");

		for (int i = 0; i < A1.length; i++) {
			for (int j = 0; j < A1[0].length; j++) {
				if (codeResult[i][j] != eResult2[i][j]) {
					iPassed = false;
					break;
				}
			}
		}
		if (iPassed) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}		


	}

	
	//
	// Important: Do NOT change any test code in main() above this line!
	//
	
	// Define the countInRange() method here
	public static int countInRange(int[] newArray, int firstBound, int secondBound) {
		int count = 0;
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] <= Math.max(firstBound, secondBound) && newArray[i] >= Math.min(firstBound, secondBound)) {
				count++;
			}
		}
		return count;
	}
	
	// Define isMagicSquare method here
	public static boolean isMagicSquare(int[][] newArray) {

		int sum = 0;
		for (int value : newArray[0]) {
			sum += value;
		}
		
		for (int i = 0; i < newArray.length; i++) {
			if (newArray.length != newArray[i].length) {
				return false;
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < newArray[i].length; j++) {
				rowSum += newArray[i][j];
			}
			if (rowSum != sum) {
				return false;
			}
		}
		for (int i = 0; i < newArray.length; i++) {
			int columnSum = 0;
			for (int j = 0; j < newArray[i].length; j++) {
				columnSum += newArray[j][i];
			}
			if (columnSum != sum) {
				return false;
			}
		}
		int firstDiagonalSum = 0;
		for (int i = 0; i < newArray.length; i++) {
			firstDiagonalSum += newArray[i][i];
		}
		if (firstDiagonalSum != sum) {
			return false;
		}
		int secondDiagonalSum = 0;
		for (int i = newArray.length - 1; i >= 0; i--) {
			secondDiagonalSum += newArray[i][newArray.length - 1 -i];
		}
		if (secondDiagonalSum != sum) {
			return false;
		}
		return true;
	}
	
	// Define matrixAdd method here
	public static int[][] matrixAdd(int[][] arrayA, int[][] arrayB) {
		int[][] errorArray = new int[arrayA.length][arrayA[0].length];
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA[i].length; j++) {
				errorArray[i][j] = -1;
			}
		}
		
		if(arrayA.length != arrayB.length) {
			return errorArray;
		}else {
			for (int i = 0; i < arrayA.length; i++) {
				if(arrayA[i].length != arrayB[i].length) {
					return errorArray;
				}
			}
		}
		int[][] resultArray = new int[arrayA.length][arrayA[0].length];
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayA[i].length; j++) {
				resultArray[i][j] = arrayA[i][j] + arrayB[i][j];
			}
		}
		return resultArray;
	}
	
}
