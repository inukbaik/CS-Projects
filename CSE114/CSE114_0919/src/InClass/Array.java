package InClass;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {9,9,5,2,6};
		
		double total = 0;
		for (int i= 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println(total);
		
	}

}
