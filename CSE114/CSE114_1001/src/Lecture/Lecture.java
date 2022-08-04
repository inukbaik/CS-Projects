package Lecture;

public class Lecture {

	public static void sum(int[] array, int dummy) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if ( i == 0) {
				array[i] = 17;
			}
		}
		dummy = 101;
	}
	
	
	public static void main(String[] args) {
		
		int[] myarray = {5,4,3,2,1};
		int mydummy=14;
		sum(myarray, mydummy);
		for (int i = 0; i < myarray.length; i++) {
			System.out.println(myarray[i]);
		}
		System.out.println("mydum=" + mydummy);
	}

}

//Cannot figure out what the fuck this code means
