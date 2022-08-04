package Review;

public class Review {

	public static void main(String[] args) {
		showTwos(7);
		showTwos(68);
		showTwos(256);
		int[] a = {1,2,3,4,5};
		
		
		//to show the oddOnly result
		int[] testArray = {1, 15, 6, 28, 7, 10, 4, 3};
		int[] res_array = oddOnly(testArray);
		for (int i = 0; i < res_array.length; i++) {
			System.out.print(res_array[i] + " ");
		}
		System.out.println();

	}
	
	//public static void pattern(double gradient, int[] rgb)
	//Slide 2 first problem
	//public static double root_mean_square(double[] samples)
	//slide 2 second problem
	
	
	//Slide3 Method Writing
	public static void showTwos(int number) {
		
		System.out.print(number + " = ");
		
		while ( (number % 2) == 0 ) {
			System.out.print("2 * ");
			number /= 2;
		}
		System.out.println(number);
	}
	//Slide4 Method Writing
	public static int[] oddOnly(int[] inputArray) {
		int[] result;
		int count = 0;
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 == 1) {
				count++;
			}
		}
		result = new int[count];
		//need to stop the loop
		int r_idx = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 == 1) {
				// it is odd
				result[r_idx] = inputArray[i];
				r_idx++;
			}
		}
		return result;
	}
}
