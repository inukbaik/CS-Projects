package Lecture;

public class Lecture_Array_Example {
	
	public static void selectionsort(int[] a) {
		int smallest = a[0];
		int small_idx = 0;
		for(int i = 0; i < a.length; i++) {
			//select the smallest element in a[i...asize-1];
			smallest = a[i];
			small_idx = i;
			for (int j = i+1; j<a.length; j++) {
				if (a[j] < smallest){
					smallest = a[j];
					small_idx = j;
				}
			}
			//swap the samllest with a[i], if necessary;
			if (small_idx !=i) {
				int temp = a[i];
				a[i] = a[small_idx];
				a[small_idx] = temp;
			}
		}
	}
}