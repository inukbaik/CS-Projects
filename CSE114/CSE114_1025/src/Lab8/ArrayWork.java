package Lab8;

public class ArrayWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {3, 5, 9, 10};
		int[] a2 = {3, 5, 10, 9};
		int[] a3 = {3, 5, 9, 10, 12};
		int[] a4 = {3, 5, 9};
		boolean isSameRes1 = isSame(a1, a1); 
		boolean isSameRes2 = isSame(a2, a1); 
		boolean isSameRes3 = isSame(a3, a4);
		System.out.println(isSameRes1);
		System.out.println(isSameRes2);
		System.out.println(isSameRes3);
		
		int[] a5 = {10, 15, 3, 7, 8, 21, 30, 40};
		int[] a6 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] resArray = findEvens(a5);
		// Print the elements of resArray using a for loop 
		for(int i = 0; i < resArray.length; i++) {
			System.out.print(resArray[i] + " ");
		}
		System.out.println();
		resArray = findEvens(a6);
		// print the elements of resArray using a for loop
		for(int i = 0; i < resArray.length; i++) {
			System.out.print(resArray[i] + " ");
		}
		System.out.println();
		
		double[] a7 = {2.1, 15.8, 30.1, 30.1, 31.2}; 
		double[] a8 = {2.1, 15.8, 14.1, 30.1, 50.2}; 
		double[] a9 = {2.1};
		System.out.println("isSorted(a7): " + isSorted(a7)); 
		System.out.println("isSorted(a8): " + isSorted(a8)); 
		System.out.println("isSorted(a9): " + isSorted(a9));
	}
	
	public static boolean isSame(int[] firstArray, int[] secondArray) {
		//check if they have same length.
		if(firstArray.length != secondArray.length) {
			return false;
		}
		//check if the elements are same.
		for(int i = 0; i < firstArray.length; i++) {
			if(firstArray[i] != secondArray[i]) {
				return false;
			}
		}
		return true;
	}

	public static int[] findEvens(int[] newArray) {
		//"count" for the length of resultArray
		int count = 0;
		//find out the length of resultArray
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] % 2 == 0) {
				count++;
			}
		}
		//copy the even number elements from newArray to resultArray
		int resultArray[] = new int[count];
		//"num" for the sequence of resultArray
		int num = 0;
		//make resultArray (length = num) with the even numbers
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] % 2 == 0) {
				resultArray[num] = newArray[i];
				num++;
			}
		}
		return resultArray;
	}
	
	public static boolean isSorted(double[] newArray) {
		//"max" to compare with elements in array
		double max = newArray[0];
		//renew max if the element is bigger than max
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] >= max) {
				max = newArray[i];
			}else {
				//break if element is smaller than max
				break;
			}
		}
		//compare max with the last element in the array
		if(max != newArray[newArray.length - 1]) {
			return false;
		}
		return true;
	}
}
