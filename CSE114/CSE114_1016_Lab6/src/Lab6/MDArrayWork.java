package Lab6;
//
// Name: Inuk Baik
// SBU ID: 112493042
// Email: inuk.baik@stonybrook.edu
//

public class MDArrayWork {

	static final int maxStudent = 5;
	static final int maxExam = 4;
	
	static double[][][] scores = {
			   {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
			   {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
			   {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
			   {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
			   {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
			   {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}}}; 

	// !!!Warning: Do not change any code in main() which runs the test cases.

	public static void main(String[] args) {
		System.out.println("Test Cases for test_average: ");
		double theAverage;
		double eps = 0.0001;
		
		// Test case 1
		double testCase1_Expected = 9.2666666;
		theAverage = test_average(1, 'E');
		System.out.println("   Test 1, part 'E': " + theAverage);
		if (Math.abs(theAverage - testCase1_Expected) < eps) {
			System.out.println("   Test case 1 => Passed!");
		} else {
			System.out.println("   Test case 1 => Failed!");			
		}

			// Test case 2
		double testCase2_Expected = 34;
		theAverage = test_average(2, 'M');
		System.out.println("   Test 2, part 'M': " + theAverage);
		if (Math.abs(theAverage - testCase2_Expected) < eps) {
			System.out.println("   Test case 2 => Passed!");
		} else {
			System.out.println("   Test case 2 => Failed!");
		}

		// Test case 3
		theAverage = test_average(6, 'M');
		System.out.println("   Test 6, part 'M': " + theAverage);
		if (theAverage < 0.0) {
			System.out.println("   Test case 3 => Passed!");
		} else {
			System.out.println("   Test case 3 => Failed!");
		}
		// Test case 4
		theAverage = test_average(3, 'P');
		System.out.println("   Test 3, part 'P': " + theAverage);
		if (theAverage < 0.0) {
			System.out.println("   Test case 4 => Passed!");
		} else {
			System.out.println("   Test case 4 => Failed!");
		}
		
		// Test case 5
		double testCase5_Expected = 21.8333333;
		theAverage = test_average(3, 'M');
		System.out.println("   Test 3, part 'M': " + theAverage);
		if (Math.abs(theAverage - testCase5_Expected) < eps) {
			System.out.println("   Test case 5 => Passed!");
		} else {
			System.out.println("   Test case 5 => Failed!");
		}

		System.out.println("Test Cases for gradeCorrection: ");
		
		// Test case 1
		gradeCorrection(1, 2, 'E', 9.9);
		if (Math.abs(scores[1][2][0] - 9.9) < eps) {
			System.out.println("   Test case 1 => Passed!");
		} else {
			System.out.println("   Test case 1 => Failed!");
		}
		
		// Test case 2
		gradeCorrection(2, 3, 'M', 25.5);
		if (Math.abs(scores[2][3][1] - 25.5) < eps) {
			System.out.println("   Test case 2 => Passed!");
		} else {
			System.out.println("   Test case 2 => Failed!");
		}
		
		// Test case 3
		gradeCorrection(3, 3, 'M', 25.5);
		if (Math.abs(scores[3][3][1] - 25.5) < eps) {
			System.out.println("   Test case 3 => Passed!");
		} else {
			System.out.println("   Test case 3 => Failed!");
		}
		
		
		// Test case 4
		gradeCorrection(4, 3, 'M', 25.5);
		if (Math.abs(scores[4][3][1] - 25.5) < eps) {
			System.out.println("   Test case 4 => Passed!");
		} else {
			System.out.println("   Test case 4 => Failed!");
		}
		
		System.out.println("Additional Test Cases for test_average: ");

		// Test case 6
		double testCase6_Expected = 23.166666;
		theAverage = test_average(3, 'M');
		System.out.println("   Test 3, part 'M': " + theAverage);
		if (Math.abs(theAverage - testCase6_Expected) < eps) {
			System.out.println("   Test case 6 => Passed!");
		} else {
			System.out.println("   Test case 6 => Failed!");
		}

		
	}

	// !!!Warning: Do not change any code in main() which runs the test cases.
	
	// Define test_average() here
	public static double test_average(int examNumber, char examPart) {
		double totalScore = 0;
		if (examNumber >= 0 && examNumber <= 4) {
			if (examPart == 'E') {
				for(int i = 0; i < scores.length; i++) {
					totalScore += scores[i][examNumber][0];
				}
				double average = totalScore / scores.length;
				return average;
			}else if (examPart == 'M') {
				for(int i = 0; i <scores.length; i++) {
					totalScore += scores[i][examNumber][1];
				}
				double average = totalScore / scores.length;
				return average;
			}else {
				return -1.0;
			}
		}else {
			return -1.0;
		}
	}
	
	// Define gradeCorrection() here
	public static void gradeCorrection(int studentNumber, int examNumber, char examPart, double newGrade) {
		if (examNumber >= 0 && examNumber <= 4) {
			if (examPart == 'E') {
				scores[studentNumber][examNumber][0] = newGrade;
			}else if (examPart == 'M') {
				scores[studentNumber][examNumber][1] = newGrade;
			}
		}
	}
}
