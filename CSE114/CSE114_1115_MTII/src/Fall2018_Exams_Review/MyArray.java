package Fall2018_Exams_Review;

public class MyArray {
	
	public static double[][] testArray = {{5.5, 2.1, 3.3, 7.10, 10.9},
			{2.1, 11.1, 13.3},
			{},
			{5.5, 25.5, 15.1, 23.3, 16.6, 7.7}};
	public static double[][] testArray2 = {{5, 2, 3, 7, 10},
			{2, 11, 13},
			{}};
	
	public static void main(String[] args) {
		for (int i = 0; i < testArray2.length; i++) {
			int sum = 0;
			int count = 0;
			for (int j = 0; j < testArray2[i].length; j++) {
				sum += testArray2[i][j];
				count++;
			}
			System.out.println("Row " + i + ": " + "Average= " + sum / count);
			//if (count > 0) {
			//System.out.println("Row " + i + ": " + "Average= " + sum / count);
			//} else {
			//	System.out.println("Row " + i + ": " + "Average= 0");
			}
		}
	}


